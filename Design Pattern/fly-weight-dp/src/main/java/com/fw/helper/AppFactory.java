package com.fw.helper;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class AppFactory {
	private static AppFactory instance;

	private Map<String, Object> objectMap;
	private Properties beanProperties;
	private String propsFile;

	private AppFactory(String propsFile) throws IOException {
		this.propsFile = propsFile;
		beanProperties = new Properties();
		beanProperties.load(this.getClass().getClassLoader().getResourceAsStream(propsFile));
		objectMap = new ConcurrentHashMap<String, Object>();
	}

	public static AppFactory getInstance(String propsFile) throws IOException {
		if (instance == null) {
			synchronized (AppFactory.class) {
				if (instance == null) {
					instance = new AppFactory(propsFile);
				}
			}
		}
		return instance;
	}

	public Object getObject(String id) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String beanClass = null;
		Object obj = null;

		if (objectMap.containsKey(id)) {
			return objectMap.get(id);
		} else {
			beanClass = beanProperties.getProperty(id);
			obj = Class.forName(beanClass).newInstance();
			objectMap.put(id, obj);
			return obj;
		}
	}
}
