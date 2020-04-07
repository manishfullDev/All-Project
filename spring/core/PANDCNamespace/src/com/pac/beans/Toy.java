package com.pac.beans;

public class Toy {
	private String toyName;
	private int ageGroup;
	private String manufacturer;
	private String color;
	private float price;
	private Machine machine;

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	@Override
	public String toString() {
		return "Toy [toyName=" + toyName + ", ageGroup=" + ageGroup + ", manufacturer=" + manufacturer + ", color="
				+ color + ", price=" + price + ", machine=" + machine + "]";
	}

}
