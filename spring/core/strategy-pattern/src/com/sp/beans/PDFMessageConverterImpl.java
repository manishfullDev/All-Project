package com.sp.beans;

public class PDFMessageConverterImpl implements IMessageConverter {
	@Override
	public String convert(String message) {
		String pdfMessage = null;

		pdfMessage = "<pdf>" + message + "</pdf>";
		return pdfMessage;
	}
}
