package com.tpct.converters;

import org.springframework.core.convert.converter.Converter;

import com.tpct.beans.MapType;

public class StringToMapTypeConverter implements Converter<String, MapType> {

	@Override
	public MapType convert(String source) {
		boolean traffic = false;
		String viewType = null;
		MapType mapType = null;
		String[] tokens = null;

		tokens = source.split(",");
		viewType = tokens[0];
		traffic = new Boolean(tokens[1]);

		mapType = new MapType();
		mapType.setViewType(viewType);
		mapType.setTraffic(traffic);

		return mapType;
	}

}
