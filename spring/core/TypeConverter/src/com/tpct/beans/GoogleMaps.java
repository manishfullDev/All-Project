package com.tpct.beans;

public class GoogleMaps {
	private Location source;
	private Location destination;
	private MapType mapType;

	public void direction(String transport) {

		System.out.println("rending map from building " + source.getBuilding() + " to building : "
				+ destination.getBuilding() + " with view as : " + mapType.getViewType());

	}

	public void setSource(Location source) {
		this.source = source;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public void setMapType(MapType mapType) {
		this.mapType = mapType;
	}

}
