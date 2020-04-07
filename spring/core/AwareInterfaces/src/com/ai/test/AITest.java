package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ai.beans.Car;

public class AITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ai/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive("yamahaEngine");
	}
}
