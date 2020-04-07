package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.StorageRoom;

public class PITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pi/common/application-context.xml"));
		StorageRoom storageRoom = factory.getBean("storageRoom", StorageRoom.class);
		System.out.println(storageRoom);
	}
}
