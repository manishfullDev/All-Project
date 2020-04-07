package com.tpct.converters;

import org.springframework.core.convert.converter.Converter;

import com.tpct.beans.Location;

public class StringToLocationConverter implements Converter<String, Location> {
	@Override
	public Location convert(String source) {
		String building = null;
		String[] tokens = null;
		Location location = null;
		String streetName = null;
		int zip = 0;

		tokens = source.split(",");
		building = tokens[0];
		streetName = tokens[1];
		zip = Integer.parseInt(tokens[2]);

		location = new Location();
		location.setBuilding(building);
		location.setStreetName(streetName);
		location.setZip(zip);

		return location;
	}
}
