package com.req.annon;

import org.springframework.beans.factory.annotation.Required;

public class FuelTank {
	private String fuelType;
	private int capacity;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
