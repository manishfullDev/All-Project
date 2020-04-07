package com.sax.test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.sax.accessor.POXmlAccessor;

public class SAXTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		POXmlAccessor accessor = new POXmlAccessor();
		accessor.printPOXml("D:\\work\\master\\webservices\\20190417\\jaxp\\sax\\resources\\po.xml");
	}
}
