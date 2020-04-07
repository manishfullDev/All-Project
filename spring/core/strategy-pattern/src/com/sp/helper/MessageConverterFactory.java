package com.sp.helper;

import com.sp.beans.HTMLMessageConverterImpl;
import com.sp.beans.IMessageConverter;
import com.sp.beans.PDFMessageConverterImpl;

public class MessageConverterFactory {
	public static IMessageConverter createMessageConverter(String type) {
		IMessageConverter messageConverter = null;

		if (type.equals("html")) {
			messageConverter = new HTMLMessageConverterImpl();
		} else if (type.equals("pdf")) {
			messageConverter = new PDFMessageConverterImpl();
		}

		return messageConverter;
	}
}
