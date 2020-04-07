package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.di.beans.DeliveryAgent;

public class DITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/di/common/application-context.xml"));
		DeliveryAgent deliveryAgent = factory.getBean("deliveryAgent", DeliveryAgent.class);
		deliveryAgent.scheduleDelivery();
	}
}
