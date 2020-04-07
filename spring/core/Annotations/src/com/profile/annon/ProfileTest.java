package com.profile.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		//System.setProperty("spring.profiles.active", "dev");
		
		ApplicationContext context = new AnnotationConfigApplicationContext();
		((ConfigurableApplicationContext)context).getEnvironment().setActiveProfiles("test");
		((AnnotationConfigApplicationContext)context).register(RootConfig.class);
		((ConfigurableApplicationContext)context).refresh();
		
		String[] profiles = context.getEnvironment().getActiveProfiles();
		for (String profile : profiles) {
			System.out.println(profile);
		}
		ProductAccessor productAccessor = context.getBean("productAccessor", ProductAccessor.class);
		productAccessor.showConnection();

	}
}
