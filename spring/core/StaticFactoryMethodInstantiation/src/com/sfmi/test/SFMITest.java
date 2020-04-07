package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.Meeting;

public class SFMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sfmi/common/application-context.xml"));
		Meeting meeting = factory.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}
}
