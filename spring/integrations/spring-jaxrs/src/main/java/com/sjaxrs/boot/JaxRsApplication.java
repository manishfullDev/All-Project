package com.sjaxrs.boot;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ApplicationPath("/api")
public class JaxRsApplication extends Application {
	private Set<Object> singletons;

	public JaxRsApplication(@Context ServletContext context) {
		String beanDefinitionNames[] = null;

		singletons = new HashSet<>();
		ApplicationContext applicationContext = null;

		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
		beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames) {
			if (beanName.endsWith("Resource")) {
				singletons.add(applicationContext.getBean(beanName));
			}
		}
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
