package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Microprocessor;
import com.bpp.beans.Rocket;
import com.bpp.beans.SignalAnalyzer;
import com.bpp.util.InstanceTracker;

public class BPPTest {
	public static void main(String[] args) {
		/*
		 * BeanFactory factory = new XmlBeanFactory(new
		 * ClassPathResource("com/bpp/common/application-context.xml"));
		 * BeanPostProcessor bpp = factory.getBean("objectTrackerBeanPostProcessor",
		 * BeanPostProcessor.class);
		 * ((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bpp/common/application-context.xml");

		Rocket rocket = context.getBean("rocket", Rocket.class);
		System.out.println("instances : " + InstanceTracker.getInstances());
		Microprocessor mp = context.getBean("microprocessor", Microprocessor.class);
		System.out.println("instances : " + InstanceTracker.getInstances());
		SignalAnalyzer sa = context.getBean("signalAnalyzer", SignalAnalyzer.class);
		System.out.println("instances : " + InstanceTracker.getInstances());
	}
}
