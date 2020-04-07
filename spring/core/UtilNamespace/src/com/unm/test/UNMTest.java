package com.unm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.unm.beans.Product;

public class UNMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/unm/common/application-context.xml"));
		Product product = factory.getBean("samsungled32tv", Product.class);
		System.out.println(product);
		System.out.println(product.getSpecifications().getClass().getName());
	}
}
