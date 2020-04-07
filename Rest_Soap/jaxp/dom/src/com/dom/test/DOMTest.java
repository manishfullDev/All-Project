package com.dom.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class DOMTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Document doc = null;
		DocumentBuilder builder = null;
		DocumentBuilderFactory builderFactory = null;

		builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setIgnoringElementContentWhitespace(true);
		
		builder = builderFactory.newDocumentBuilder();
		doc = builder.parse(new File("D:\\work\\master\\webservices\\20190417\\jaxp\\dom\\resources\\po.xml"));
		
		Node oiNode = doc.getFirstChild().getFirstChild().getNextSibling().getFirstChild().getNextSibling().getFirstChild().getNextSibling().getFirstChild();
		System.out.println(oiNode.getNodeValue());
		Node icNode = oiNode.getParentNode();
		System.out.println(icNode.getNodeName());
		
	}
}


















