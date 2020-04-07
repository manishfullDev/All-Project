package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Toy;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		// Toy toy = factory.getBean("sheriff,downtown", Toy.class);
		// toy.play();
		String[] aliases = factory.getAliases("mcqueen");
		System.out.println(aliases.length);
	}
}
