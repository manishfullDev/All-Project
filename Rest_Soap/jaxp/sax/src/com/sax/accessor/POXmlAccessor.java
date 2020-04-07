package com.sax.accessor;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.handlers.PrintHandler;

public class POXmlAccessor {
	public void printPOXml(String inFilePath) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = null;
		SAXParser saxParser = null;
		PrintHandler handler = null;

		factory = SAXParserFactory.newInstance();
		saxParser = factory.newSAXParser();
		handler = new PrintHandler();

		saxParser.parse(new File(inFilePath), handler);
	}
}












