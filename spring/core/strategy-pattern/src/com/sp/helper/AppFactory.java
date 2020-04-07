package com.sp.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppFactory {
	public static Object createObject(String lClassname)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties props = null;
		InputStream in = null;
		String classname = null;
		Class<?> clazz = null;
		Object obj = null;

		props = new Properties();
		ClassLoader cl = AppFactory.class.getClassLoader();
		in = cl.getResourceAsStream("app-classes.properties");

		props.load(in);
		classname = props.getProperty(lClassname);
		clazz = Class.forName(classname);
		obj = clazz.newInstance();
		return obj;
	}
}
