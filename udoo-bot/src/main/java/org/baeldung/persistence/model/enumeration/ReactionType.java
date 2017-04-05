package org.baeldung.persistence.model.enumeration;

import javax.persistence.AttributeConverter;

public enum ReactionType {

	SEND_MESSAGE("send_message"), TRIGGER_OUTPUT("trigger_output");

	private String strId;

	private ReactionType(String strId) {
		this.strId = strId;
	}

	@javax.persistence.Converter
	public static class Converter implements AttributeConverter<ReactionType, String> {
		@Override
		public String convertToDatabaseColumn(ReactionType t) {
			return t.toString();
		}

		@Override
		public ReactionType convertToEntityAttribute(String s) {
			for (ReactionType value : ReactionType.values()) {
				if (value.strId.equalsIgnoreCase(s)) {
					return value;
				}
			}

			throw new IllegalArgumentException("Invalid value for enum: " + s);
		}
	}
}
