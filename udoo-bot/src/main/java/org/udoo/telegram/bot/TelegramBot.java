package org.udoo.telegram.bot;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

public class TelegramBot {
   
	TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
	
	@PostConstruct
    public void init() throws IOException, InterruptedException {
        try {
            telegramBotsApi.registerBot(new TelegramMsgHandler());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
	
}
