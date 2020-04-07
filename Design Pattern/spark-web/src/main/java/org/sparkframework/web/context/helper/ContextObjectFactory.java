package org.sparkframework.web.context.helper;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.sparkframework.web.context.MapContextObject;
import org.sparkframework.web.mapper.HttpMapper;
import org.sparkframework.web.mapper.Mapper;

public class ContextObjectFactory {
	private Mapper<HttpServletRequest> mapper;

	public ContextObjectFactory() {
		mapper = new HttpMapper();
	}

	public MapContextObject createMapContextObject(HttpServletRequest request) {
		Map<String, String[]> requestMap = null;
		MapContextObject mapContextObject = null;

		mapContextObject = new MapContextObject();
		requestMap = mapper.extractData(request);
		for (String paramName : requestMap.keySet()) {
			String[] paramValue = requestMap.get(paramName);
			mapContextObject.setParameter(paramName, paramValue);
		}

		return mapContextObject;
	}

	public void bindData(HttpServletRequest request, MapContextObject mapContextObject) {
		mapper.bindData(request, mapContextObject);
	}

}
