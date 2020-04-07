package com.nbf.beans;

public class Manufacturer {
	private String manufacturerName;
	private int establishedYear;

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	@Override
	public String toString() {
		return "Manufacturer [manufacturerName=" + manufacturerName + ", establishedYear=" + establishedYear + "]";
	}

}
