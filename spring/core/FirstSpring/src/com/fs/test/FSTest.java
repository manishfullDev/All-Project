package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.MessageWriter;

public class FSTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/fs/common/application-context.xml"));

		MessageWriter messageWriter = (MessageWriter) beanFactory.getBean("messageWriter");
		messageWriter.writeMessage("Welcome to Spring Framework");
	}
}
