package com.blm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blm.beans.ShutdownHook;
import com.blm.beans.Transmitter;

public class BLMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/blm/common/application-context.xml"));
		ShutdownHook shutdownHook = factory.getBean("shutdownHook", ShutdownHook.class);
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(shutdownHook));

		Transmitter transmitter = factory.getBean("transmitter", Transmitter.class);
		transmitter.open("192.102.02.10");
	}
}
