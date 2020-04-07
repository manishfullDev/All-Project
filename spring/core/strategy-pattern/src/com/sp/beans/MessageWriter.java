package com.sp.beans;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String htmlMessage = null;

		htmlMessage = messageConverter.convert(message);
		System.out.println(htmlMessage);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

}
