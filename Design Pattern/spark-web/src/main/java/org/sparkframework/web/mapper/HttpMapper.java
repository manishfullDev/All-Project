package org.sparkframework.web.mapper;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.sparkframework.web.context.MapContextObject;

public class HttpMapper implements Mapper<HttpServletRequest> {

	@Override
	public Map<String, String[]> extractData(HttpServletRequest request) {
		return request.getParameterMap();
	}

	@Override
	public void bindData(HttpServletRequest request, MapContextObject mapContextObject) {
		Set<String> keys = null;
		Object paramValue = null;
		Map<String, Object> responseMap = null;

		responseMap = mapContextObject.getResponseMap();
		if (responseMap.size() > 0) {
			keys = responseMap.keySet();
			for (String paramName : keys) {
				paramValue = responseMap.get(paramName);
				request.setAttribute(paramName, paramValue);
			}
		}

	}

}
