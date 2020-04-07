package com.jee5.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

import com.jee5.config.handler.ConfigHandler;

@HandlesTypes({ ConfigHandler.class })
public class Jee5ApplicationInitializer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> classes, ServletContext ctx) throws ServletException {
		System.out.println("jee5 application initializer");
		for (Class<?> clazz : classes) {
			try {
				((ConfigHandler) (clazz.newInstance())).configuration(ctx);
			} catch (InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
}











