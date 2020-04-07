package com.fomatters.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formatters.beans.ApplicationForm;

public class FormatterTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/formatters/common/application-context.xml");
		ApplicationForm applicationForm = context.getBean("applicationForm", ApplicationForm.class);
		System.out.println(applicationForm);
	}
}
