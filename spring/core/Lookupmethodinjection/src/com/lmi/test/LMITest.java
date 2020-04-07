package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.worker.Worker;

public class LMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lmi/common/application-context.xml"));
		Worker worker1 = new Worker("Television", factory);
		Worker worker2 = new Worker("Mobile", factory);
		worker1.setName("worker1");
		worker2.setName("worker2");
		worker1.start();
		worker2.start();
	}
}
