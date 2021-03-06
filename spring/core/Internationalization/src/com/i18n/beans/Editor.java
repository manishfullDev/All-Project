package com.i18n.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class Editor {
	private MessageSource messageSource;

	public void writeMessage(String key) {
		String message = null;

		message = messageSource.getMessage(key, null, Locale.SIMPLIFIED_CHINESE);
		System.out.println(message);
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
