package com.tpct.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.tpct.beans.GoogleMaps;

public class TPCTTest {
	public static void main(String[] args) {
		/*
		 * BeanFactory factory = new XmlBeanFactory(new
		 * ClassPathResource("com/tpct/common/application-context.xml"));
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tpct/common/application-context.xml");
		GoogleMaps gm = context.getBean("googleMaps", GoogleMaps.class);
		gm.direction("bike");
	}
}
