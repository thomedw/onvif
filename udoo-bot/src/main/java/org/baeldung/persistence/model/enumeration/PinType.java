package org.baeldung.persistence.model.enumeration;

import javax.persistence.AttributeConverter;

public enum PinType {
	LED("led"), BUZZER("buzzer"), BUTTON("button");
	//PWM_LED, LDR, TEMPERATURE_SESOR, POTENTIOMETER, MOTION_SENSOR
	
	private String strId;

	private PinType(String strId) {
		this.strId = strId;
	}

	@javax.persistence.Converter
	public static class Converter implements AttributeConverter<PinType, String> {
		@Override
		public String convertToDatabaseColumn(PinType t) {
			return t.toString();
		}

		@Override
		public PinType convertToEntityAttribute(String s) {
			for (PinType value : PinType.values()) {
				if (value.strId.equalsIgnoreCase(s)) {
					return value;
				}
			}

			throw new IllegalArgumentException("Invalid value for enum: " + s);
		}
	}
}
