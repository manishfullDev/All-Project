package com.boot.cp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "fueltank")
public class FuelTank {
	@Value("#{cpProperties.fuelTankNo}")
	private int fuelTankNo;
	private String fuelType;
	private int capacity;
	private int fuelLevel;

	public int getFuelTankNo() {
		return fuelTankNo;
	}

	public void setFuelTankNo(int fuelTankNo) {
		this.fuelTankNo = fuelTankNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelTankNo=" + fuelTankNo + ", fuelType=" + fuelType + ", capacity=" + capacity
				+ ", fuelLevel=" + fuelLevel + "]";
	}

}
