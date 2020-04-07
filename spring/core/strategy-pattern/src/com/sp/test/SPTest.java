package com.sp.test;

import java.io.IOException;

import com.sp.beans.IMessageConverter;
import com.sp.beans.MessageWriter;
import com.sp.helper.AppFactory;

public class SPTest {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		MessageWriter messageWriter = (MessageWriter) AppFactory.createObject("messageWriter.class");
		IMessageConverter messageConverter = (IMessageConverter) AppFactory.createObject("messageConverter.class");

		messageWriter.setMessageConverter(messageConverter);

		messageWriter.writeMessage("Welcome to Strategy Pattern");
	}
}
