package com.beanscopes.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanscopes.beans.Timezone;

public class BeanScopesTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/beanscopes/common/application-context.xml"));

		Timezone tz1 = factory.getBean("timezone1", Timezone.class);
		Timezone tz2 = factory.getBean("timezone2", Timezone.class);

		System.out.println("tz1 == tz2 ? : " + (tz1 == tz2));
	}
}
