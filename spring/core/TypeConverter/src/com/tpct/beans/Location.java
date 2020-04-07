package com.tpct.beans;

public class Location {
	private String building;
	private String streetName;
	private int zip;

	public String getBuilding() {
		return building;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getZip() {
		return zip;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Location [building=" + building + ", streetName=" + streetName + ", zip=" + zip + "]";
	}

}
