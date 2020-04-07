package com.iom.accessors.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class POTotalQuantityHandler extends DefaultHandler {
	private String element;
	private long totalQuantity;

	@Override
	public void characters(char[] doc, int offset, int length) throws SAXException {
		String data = null;
		if (element != null && element.equals("quantity")) {
			data = new String(doc, offset, length);
			totalQuantity += Integer.parseInt(data);
		}
	}

	@Override
	public void endElement(String namespaceUri, String localName, String qName) throws SAXException {
		element = null;
	}

	@Override
	public void startElement(String namespaceUri, String localName, String qName, Attributes attributes)
			throws SAXException {
		element = qName;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

}
