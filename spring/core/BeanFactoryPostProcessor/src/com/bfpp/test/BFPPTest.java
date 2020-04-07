package com.bfpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.beans.ConnectionManager;

public class BFPPTest {
	public static void main(String[] args) {
		/*
		 * BeanFactory factory = new XmlBeanFactory(new
		 * ClassPathResource("com/bfpp/common/application-context.xml"));
		 * BeanFactoryPostProcessor ppc = factory.getBean("ppc",
		 * BeanFactoryPostProcessor.class);
		 * ppc.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);
		 * 
		 * ConnectionManager cm = factory.getBean("connectionManager",
		 * ConnectionManager.class); System.out.println(cm);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bfpp/common/application-context.xml");
		ConnectionManager cm = context.getBean("connectionManager", ConnectionManager.class);
		System.out.println(cm);
	}
}












