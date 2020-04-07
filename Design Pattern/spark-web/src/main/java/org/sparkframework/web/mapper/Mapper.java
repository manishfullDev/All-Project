package org.sparkframework.web.mapper;

import java.util.Map;

import org.sparkframework.web.context.MapContextObject;

public interface Mapper<T> {
	Map<String, String[]> extractData(T t);

	void bindData(T t, MapContextObject mapContextObject);
}
