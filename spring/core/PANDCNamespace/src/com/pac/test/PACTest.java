package com.pac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pac.beans.Toy;

public class PACTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pac/common/application-context.xml"));
		Toy toy = factory.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}
