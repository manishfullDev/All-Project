package com.aa.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instance;
	private Map<String, Object> dataMap;

	private Cache() {
		dataMap = new ConcurrentHashMap<String, Object>();
	}

	public synchronized static Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, Object value) {
		dataMap.put(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}

}
