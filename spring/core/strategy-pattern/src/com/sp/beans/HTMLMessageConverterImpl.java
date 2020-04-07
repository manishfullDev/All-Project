package com.sp.beans;

public class HTMLMessageConverterImpl implements IMessageConverter {
	@Override
	public String convert(String message) {
		String htmlMessage = null;
		htmlMessage = "<html><head/><body>" + message + "</body></html>";
		return htmlMessage;
	}
}
