package org.udoo.telegram.bot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.net.ConnectException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.xml.soap.SOAPException;

import org.apache.commons.io.FileUtils;
import org.apache.http.ParseException;
import org.onvif.ver10.schema.MediaUri;
import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.logging.BotLogger;

import com.diozero.Button;
import com.diozero.LED;
import com.diozero.api.Action;
import com.diozero.api.DigitalInputDevice;
import com.diozero.api.DigitalInputEvent;
import com.diozero.api.GpioEventTrigger;
import com.diozero.api.GpioPullUpDown;
import com.diozero.api.InputEventListener;
import com.diozero.api.SmoothedInputDevice;
import com.diozero.internal.DeviceFactoryHelper;
import com.diozero.internal.spi.GpioDeviceFactoryInterface;
import com.diozero.util.RuntimeIOException;

import de.onvif.soap.OnvifDevice;

public class TelegramMsgHandler extends TelegramLongPollingBot {
	public static final String LOGTAG = "UDOOAPP";

	private final ConcurrentLinkedQueue<Integer> languageMessages = new ConcurrentLinkedQueue<>();
	private static Properties pinMappings;

	public static final Map<Integer, Integer> android2Gpio = new HashMap<>();

	private Map<String, OnvifDevice> onvifCameras = new HashMap<>();
	private Map<String, String> onvifCamerasTokens = new HashMap<>();

	int apriPocoSeconds = 2;
	int apriTuttoSeconds = 6;

	private final LED cancelloGrandeApri;
	private final LED cancelloGrandeChiudi;
	private final Button campanello;

	private Long chatId;

	@Override
	public String getBotUsername() {
		return "@fla83tnbot";
	}
	@Override
	public String getBotToken() {
		return "181405571:AAGWjGELUB4m3VE4RA1Qytxy0hB7l0lA9cw";
	}
	
	public TelegramMsgHandler() throws IOException, InterruptedException {
		// initOnvifDevices();
		initPinMappings();
		cancelloGrandeApri = new LED(android2Gpio.get(5));
		cancelloGrandeChiudi = new LED(android2Gpio.get(6));
		campanello = new Button(android2Gpio.get(23));
		campanello.whenPressed(new Action() {
			
			@Override
			public void action() {
				if (chatId!=null){
					SendMessage resp = new SendMessage();
					resp.setText("Minghie!");
					resp.setChatId(chatId.toString());
					try {
			           sendMessage(resp);
			       } catch (TelegramApiException e) {
			    	   BotLogger.error(LOGTAG, e);
			       }
				}
			}
		});

		cancelloGrandeApri.blink(1, 1, 4, false);
	}

	private void initOnvifDevices() throws FileNotFoundException, IOException {
		Properties config = new Properties();
		config.load(new FileInputStream(new File("onvif.properties")));
		for (Entry<Object, Object> entry : config.entrySet()) {
			String deviceName = (String) entry.getKey();
			String[] confStr = ((String) entry.getValue()).split(",");
			String deviceIp = confStr[0];
			String user = confStr[1];
			String password = confStr[2];
			// profileToken = "MediaProfile000"/"MediaProfile001";
			String profileToken = confStr[3];
			OnvifDevice cam = null;
			try {
				System.out.println("Connect to camera, please wait ...");
				cam = new OnvifDevice(deviceIp, user, password);
				System.out.printf("Connected to device %s (%s)\n", cam.getDeviceInfo(), deviceName);
				onvifCameras.put(deviceName, cam);
				onvifCamerasTokens.put(deviceName, profileToken);
			} catch (ConnectException | SOAPException e1) {
				System.err.println("No connection to device with ip " + deviceIp + ", please try again.");
				System.exit(0);
			}
		}

	}

	private static File takeScreenShot(String profileToken, OnvifDevice cam) {
		try {
			MediaUri sceenshotUri = cam.getMedia().getSnapshotUri(profileToken);
			File tempFile = File.createTempFile("tmp", ".jpg");
			FileUtils.copyURLToFile(new URL(sceenshotUri.getUri()), tempFile);
			return tempFile;
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void onUpdateReceived(Update update) {
		System.out.println(update);
		try {
			// handleFileUpdate(update);
			onMessageReceived(update);
		} catch (InvalidObjectException | TelegramApiException | InterruptedException e) {
			BotLogger.error(LOGTAG, e);
		}
	}

	private void onMessageReceived(Update update)
			throws InvalidObjectException, InterruptedException, TelegramApiException {
		Message message = update.getMessage();
		if (message == null || !message.hasText()) {
			return;
		}
		this.chatId = message.getChatId();
		if (message.getText().toLowerCase().equals("test")) {
			sendMessage(onBackAlertCommand(message, "IT"));
		} else if (message.getText().toLowerCase().equals("apri")) {
			cancelloGrandeApri.blink(apriPocoSeconds, 0, 1, true);
		} else if (message.getText().toLowerCase().equals("chiudi")) {
			cancelloGrandeChiudi.blink(apriPocoSeconds, 0, 1, true);
		} else if (message.getText().toLowerCase().equals("foto")) {
			String cameraId = "fla-cam";
			File picture = takeScreenShot(onvifCamerasTokens.get(cameraId), onvifCameras.get(cameraId));
			try {
				SendPhoto sendPhotoReq = new SendPhoto();
				sendPhotoReq.setChatId(message.getChatId() + "");
				sendPhotoReq.setNewPhoto(picture.getAbsolutePath(), picture.getName());
				sendPhoto(sendPhotoReq);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	private void handleFileUpdate(Update update) throws InvalidObjectException {
		Message message = update.getMessage();
		if (message != null && message.hasText()) {
			if (languageMessages.contains(message.getFrom().getId())) {
				onLanguageReceived(message);
			} else {
				// String language =
				// DatabaseManager.getInstance().getUserLanguage(update.getMessage().getFrom().getId());
				// if
				// (message.getText().startsWith(Commands.setLanguageCommand)) {
				// onSetLanguageCommand(message, language);
				// } else {
				// String[] parts = message.getText().split(" ", 2);
				// if (parts[0].startsWith(Commands.startCommand)) {
				// if (parts.length == 2) {
				// onStartWithParameters(message, language, parts[1]);
				// } else {
				// sendHelpMessage(message, language);
				// }
				// } else if (!message.isGroupMessage()) {
				// if (parts[0].startsWith(Commands.uploadCommand)) { // Open
				// upload for user
				// onUploadCommand(message, language);
				// } else if (parts[0].startsWith(Commands.cancelCommand)) {
				// onCancelCommand(message, language);
				// } else if (parts[0].startsWith(Commands.deleteCommand)) {
				// onDeleteCommand(message, language, parts);
				// } else if (parts[0].startsWith(Commands.listCommand)) {
				// onListCommand(message, language);
				// } else {
				// sendHelpMessage(message, language);
				// }
				// }
			}
		}
		// }
		// else if (message != null && message.hasDocument()
		// &&
		// DatabaseManager.getInstance().getUserStatusForFile(message.getFrom().getId())
		// == INITIAL_UPLOAD_STATUS) {
		// String language =
		// DatabaseManager.getInstance().getUserLanguage(update.getMessage().getFrom().getId());
		// DatabaseManager.getInstance().addFile(message.getDocument().getFileId(),
		// message.getFrom().getId(), message.getDocument().getFileName());
		// SendMessage sendMessageRequest = new SendMessage();
		// sendMessageRequest.setText(LocalisationService.getInstance().getString("fileUploaded",
		// language) +
		// LocalisationService.getInstance().getString("uploadedFileURL",
		// language) + message.getDocument().getFileId());
		// sendMessageRequest.setChatId(message.getChatId().toString());
		// try {
		// sendMessage(sendMessageRequest);
		// } catch (TelegramApiException e) {
		// BotLogger.error(LOGTAG, e);
		// }
		// }
	}

	private void onListCommand(Message message, String language) throws InvalidObjectException {
		System.out.println(message);
		// HashMap<String, String> files =
		// DatabaseManager.getInstance().getFilesByUser(message.getFrom().getId());
		// SendMessage sendMessageRequest = new SendMessage();
		// if (files.size() > 0) {
		// String text =
		// LocalisationService.getInstance().getString("listOfFiles", language)
		// + ":\n\n";
		// for (Map.Entry<String, String> entry : files.entrySet()) {
		// text +=
		// LocalisationService.getInstance().getString("uploadedFileURL",
		// language)
		// + entry.getKey() + " " + Emoji.LEFT_RIGHT_ARROW.toString() + " " +
		// entry.getValue() + "\n";
		// }
		// sendMessageRequest.setText(text);
		// } else {
		// sendMessageRequest.setText(LocalisationService.getInstance().getString("noFiles",
		// language));
		// }
		// sendMessageRequest.setChatId(message.getChatId().toString());
		// ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
		// replyKeyboardHide.setHideKeyboard(true);
		// sendMessageRequest.setReplayMarkup(replyKeyboardHide);
		// try {
		// sendMessage(sendMessageRequest);
		// } catch (TelegramApiException e) {
		// BotLogger.error(LOGTAG, e);
		// }
	}

	private void onDeleteCommand(Message message, String language, String[] parts) throws InvalidObjectException {
		// if
		// (DatabaseManager.getInstance().getUserStatusForFile(message.getFrom().getId())
		// == DELETE_UPLOADED_STATUS &&
		// parts.length == 2) {
		// onDeleteCommandWithParameters(message, language, parts[1]);
		// } else {
		// onDeleteCommandWithoutParameters(message, language);
		// }
	}

	private void onSetLanguageCommand(Message message, String language) throws InvalidObjectException {
		// SendMessage sendMessageRequest = new SendMessage();
		// sendMessageRequest.setChatId(message.getChatId().toString());
		// ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
		// HashMap<String, String> languages =
		// LocalisationService.getInstance().getSupportedLanguages();
		// List<List<String>> commands = new ArrayList<>();
		// for (Map.Entry<String, String> entry : languages.entrySet()) {
		// List<String> commandRow = new ArrayList<>();
		// commandRow.add(entry.getKey() + " " +
		// Emoji.LEFT_RIGHT_ARROW.toString() + " " + entry.getValue());
		// commands.add(commandRow);
		// }
		// replyKeyboardMarkup.setResizeKeyboard(true);
		// replyKeyboardMarkup.setOneTimeKeyboad(true);
		// replyKeyboardMarkup.setKeyboard(commands);
		// replyKeyboardMarkup.setSelective(true);
		// sendMessageRequest.setReplayMarkup(replyKeyboardMarkup);
		// sendMessageRequest.setText(LocalisationService.getInstance().getString("chooselanguage",
		// language));
		// try {
		// sendMessage(sendMessageRequest);
		// languageMessages.add(message.getFrom().getId());
		// } catch (TelegramApiException e) {
		// BotLogger.error(LOGTAG, e);
		// }
	}

	private void onLanguageReceived(Message message) throws InvalidObjectException {
		// String[] parts =
		// message.getText().split(Emoji.LEFT_RIGHT_ARROW.toString(), 2);
		// SendMessage sendMessageRequest = new SendMessage();
		// sendMessageRequest.setChatId(message.getChatId().toString());
		// if
		// (LocalisationService.getInstance().getSupportedLanguages().containsKey(parts[0].trim()))
		// {
		// DatabaseManager.getInstance().putUserLanguage(message.getFrom().getId(),
		// parts[0].trim());
		// sendMessageRequest.setText(LocalisationService.getInstance().getString("languageModified",
		// parts[0].trim()));
		// } else {
		// sendMessageRequest.setText(LocalisationService.getInstance().getString("errorLanguage"));
		// }
		// sendMessageRequest.setReplayToMessageId(message.getMessageId());
		// ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
		// replyKeyboardHide.setHideKeyboard(true);
		// replyKeyboardHide.setSelective(true);
		// sendMessageRequest.setReplayMarkup(replyKeyboardHide);
		// try {
		// sendMessage(sendMessageRequest);
		// languageMessages.remove(message.getFrom().getId());
		// } catch (TelegramApiException e) {
		// BotLogger.error(LOGTAG, e);
		// }
	}

	private static void initPinMappings() throws IOException {
		pinMappings = new Properties();
		pinMappings.load(TelegramBot.class.getResourceAsStream("/pin-mappings.properties"));
		// 53 pins
		for (int i = 1; i < 54; i++) {
			android2Gpio.put(i, new Integer(pinMappings.getProperty(i + "")));
		}
	}

	private static SendMessage onBackAlertCommand(Message message, String language) {
		SendMessage sendMessage = new SendMessage();
		sendMessage.enableMarkdown(true);

		ReplyKeyboardMarkup replyKeyboardMarkup = getSettingsKeyboard(language);
		sendMessage.setReplayMarkup(replyKeyboardMarkup);
		sendMessage.setReplayToMessageId(message.getMessageId());
		sendMessage.setChatId(message.getChatId().toString());
		sendMessage.setText(getSettingsMessage(language));

		// DatabaseManager.getInstance().insertWeatherState(message.getFrom().getId(),
		// message.getChatId(), SETTINGS);
		return sendMessage;
	}

	private static String getSettingsMessage(String language) {
		String baseString = "test";
		return String.format(baseString, Emoji.GLOBE_WITH_MERIDIANS.toString(), Emoji.STRAIGHT_RULER.toString(),
				Emoji.ALARM_CLOCK.toString(), Emoji.BACK_WITH_LEFTWARDS_ARROW_ABOVE.toString());
	}

	private static ReplyKeyboardMarkup getSettingsKeyboard(String language) {
		ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
		replyKeyboardMarkup.setSelective(true);
		replyKeyboardMarkup.setResizeKeyboard(true);
		replyKeyboardMarkup.setOneTimeKeyboad(false);

		List<KeyboardRow> keyboard = new ArrayList<>();
		KeyboardRow keyboardFirstRow = new KeyboardRow();
		keyboardFirstRow.add(getRateCommand(language));
		KeyboardRow keyboardSecondRow = new KeyboardRow();
		keyboardSecondRow.add(getAlertsCommand(language));
		keyboard.add(keyboardFirstRow);
		keyboard.add(keyboardSecondRow);
		replyKeyboardMarkup.setKeyboard(keyboard);

		return replyKeyboardMarkup;
	}

	// region getCommnads

	private static String getRateCommand(String language) {
		return String.format("rateMe %s", Emoji.HUNDRED_POINTS_SYMBOL.toString());
	}

	private static String getAlertsCommand(String language) {
		return String.format("alerts %s", Emoji.ALARM_CLOCK.toString());
	}
	// endregion getCommnads

}
