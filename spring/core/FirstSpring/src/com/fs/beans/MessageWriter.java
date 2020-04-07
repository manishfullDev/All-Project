package com.fs.beans;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void writeMessage(String message) {
		String cMessage = null;

		cMessage = messageConverter.convert(message);
		System.out.println(cMessage);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

}
