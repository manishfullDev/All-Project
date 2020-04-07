package com.fa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fa.accessor.BrowseCatalog;
import com.fa.beans.Product;

public class FATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fa/common/application-context.xml");
		BrowseCatalog bc = context.getBean("browseCatalog", BrowseCatalog.class);
		Product product = bc.getProduct(-1);
		System.out.println(product);
	}
}
