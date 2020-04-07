package com.iom.test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.iom.accessors.POAccessor;

public class IOMTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		POAccessor poAccessor = new POAccessor(
				"D:\\work\\master\\webservices\\20190417\\jaxp\\IndustryOrderManagement\\resources\\po.xml");
		long tq = poAccessor.getTotalQuantity();
		System.out.println("Total Quantity : " + tq);

	}
}
