package org.sparkframework.web.context;

import java.util.HashMap;
import java.util.Map;

public class MapContextObject {
	private Map<String, String[]> requestMap;
	private Map<String, Object> responseMap;

	public MapContextObject() {
		requestMap = new HashMap<>();
		responseMap = new HashMap<>();
	}

	public void setParameter(String paramName, String paramValue) {
		requestMap.put(paramName, new String[] { paramValue });
	}

	public void setParameter(String paramName, String[] paramValue) {
		requestMap.put(paramName, paramValue);
	}

	public String getParameter(String paramName) {
		return requestMap.get(paramName)[0];
	}

	public String[] getParameters(String paramName) {
		return requestMap.get(paramName);
	}

	public void setAttribute(String paramName, Object paramValue) {
		responseMap.put(paramName, paramValue);
	}

	public Map<String, Object> getResponseMap() {
		return responseMap;
	}
}
