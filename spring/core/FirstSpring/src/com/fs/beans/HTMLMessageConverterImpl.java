package com.fs.beans;

public class HTMLMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<html><body>" + message + "</body></html>";
	}

}
