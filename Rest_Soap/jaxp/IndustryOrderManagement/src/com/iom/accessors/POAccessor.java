package com.iom.accessors;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.iom.accessors.handlers.POTotalQuantityHandler;

public class POAccessor {
	private String inFile;

	public POAccessor(String inFile) {
		this.inFile = inFile;
	}

	public long getTotalQuantity() throws ParserConfigurationException, SAXException, IOException {
		POTotalQuantityHandler poTotalQuantityHandler = null;
		SAXParserFactory saxParserFactory = null;
		SchemaFactory schemaFactory = null;
		Validator poValidator = null;
		SAXParser saxParser = null;
		Schema poSchema = null;
		long totalQuantity = 0;

		schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		poSchema = schemaFactory.newSchema(
				new File("D:\\work\\master\\webservices\\20190417\\jaxp\\IndustryOrderManagement\\resources\\po.xsd"));
		poValidator = poSchema.newValidator();
		poValidator.validate(new StreamSource(
				new File("D:\\work\\master\\webservices\\20190417\\jaxp\\IndustryOrderManagement\\resources\\po.xml")));

		saxParserFactory = SAXParserFactory.newInstance();
		saxParser = saxParserFactory.newSAXParser();
		poTotalQuantityHandler = new POTotalQuantityHandler();
		saxParser.parse(new File(inFile), poTotalQuantityHandler);
		totalQuantity = poTotalQuantityHandler.getTotalQuantity();

		return totalQuantity;
	}
}











