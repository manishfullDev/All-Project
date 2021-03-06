package com.i18n.test;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.i18n.beans.Editor;

public class I18NTest {
	public static void main(String[] args) {
		/*
		 * BeanFactory factory = new XmlBeanFactory(new
		 * ClassPathResource("com/i18n/common/application-context.xml")); Editor editor
		 * = factory.getBean("editor", Editor.class); editor.writeMessage("note");
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/i18n/common/application-context.xml");
		String message = context.getMessage("note", null, Locale.getDefault());
		System.out.println(message);
	}
}

















