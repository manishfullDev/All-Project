package com.fb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.Meeting;

public class FBTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fb/common/application-context.xml"));
		Meeting meeting = factory.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}
}
