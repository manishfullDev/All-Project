package com.pe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Table;

public class PETest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pe/common/application-context.xml"));
		Table table = factory.getBean("table", Table.class);
		System.out.println(table);
	}
}
