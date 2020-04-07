package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Course;

public class CITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		Course course = factory.getBean("course", Course.class);
		//System.out.println(course);
		System.out.println(course.getSubjects().getClass().getName());
		System.out.println(course.getFaculties().getClass().getName());
		System.out.println(course.getSubjectFaculty().getClass().getName());
		System.out.println(course.getYearToppers().getClass().getName());
	}
}
