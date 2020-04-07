package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder pf = factory.getBean("planFinder", PlanFinder.class);

		String[] plans = pf.findPlans(23, "Male", "39484", 10, "in-patient", "in-network", 1500,
				new String[] { "dental" });
		
		System.out.println("plans matching : ");
		for (String plan : plans) {
			System.out.println(plan);
		}
	}
}











