package com.sax.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PrintHandler extends DefaultHandler {

	@Override
	public void characters(char[] doc, int startIndex, int length) throws SAXException {
		String data = null;
		data = new String(doc, startIndex, length);
		System.out.print(data);
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("END DOCUMENT");
	}

	@Override
	public void endElement(String namespaceUri, String prefix, String qName) throws SAXException {
		System.out.println("</" + qName + ">");
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("START DOCUMENT");
	}

	@Override
	public void startElement(String namespaceUri, String prefix, String qName, Attributes attributes)
			throws SAXException {
		System.out.print("<" + qName + ">");
	}

}













