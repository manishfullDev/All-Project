package com.icicidirect.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.icicidirect.manager.StockManager;

public class ICICIDirectTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/icicidirect/common/application-context.xml"));
		StockManager sm = factory.getBean("stockManager", StockManager.class);
		double price = sm.getStockPrice("tcs");
		System.out.println("price : " + price);
	}
}
