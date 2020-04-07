package com.fs.beans;

public class PDFMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
