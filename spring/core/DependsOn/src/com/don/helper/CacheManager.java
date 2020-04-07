package com.don.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.don.accessor.IAccessor;

public class CacheManager {
	private Cache cache;
	private List<IAccessor> accessors;

	public void loadCache() {
		Map<String, Object> l_DataMap = null;

		l_DataMap = new HashMap<String, Object>();
		for (IAccessor accessor : accessors) {
			try {
				l_DataMap.put(accessor.getKey(), accessor.getData());
			} catch (Throwable t) {
			}
		}
		cache.putAll(l_DataMap);
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public void setAccessors(List<IAccessor> accessors) {
		this.accessors = accessors;
	}

}
