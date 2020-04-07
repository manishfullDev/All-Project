package com.transport.api.builder;

import com.transport.api.Bus;

public abstract class BusBuilder {
	protected int busNo;
	protected String color;
	protected String manufacturer;
	protected String model;
	protected String rtaRegistrationNo;
	protected String chasisNo;
	protected String engineNo;
	protected String fuelType;
	protected int capacity;

	public BusBuilder(int busNo, String manufacturer, String model, String rtaRegistrationNo) {
		this.busNo = busNo;
		this.manufacturer = manufacturer;
		this.model = model;
		this.rtaRegistrationNo = rtaRegistrationNo;
	}

	public BusBuilder busNo(int busNo) {
		this.busNo = busNo;
		return this;
	}

	public int busNo() {
		return this.busNo;
	}

	public BusBuilder color(String color) {
		this.color = color;
		return this;
	}

	public String color() {
		return this.color;
	}

	public BusBuilder manufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	public String manufacturer() {
		return this.manufacturer;
	}

	public BusBuilder model(String model) {
		this.model = model;
		return this;
	}

	public String model() {
		return this.model;
	}

	public BusBuilder rtaRegistrationNo(String rtaRegistrationNo) {
		this.rtaRegistrationNo = rtaRegistrationNo;
		return this;
	}

	public String rtaRegistrationNo() {
		return this.rtaRegistrationNo;
	}

	public BusBuilder chasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
		return this;
	}

	public String chasisNo() {
		return this.chasisNo;
	}

	public BusBuilder engineNo(String engineNo) {
		this.engineNo = engineNo;
		return this;
	}

	public String engineNo() {
		return this.engineNo;
	}

	public BusBuilder fuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}

	public String fuelType() {
		return this.fuelType;
	}

	public BusBuilder capacity(int capacity) {
		this.capacity = capacity;
		return this;
	}

	public int capacity() {
		return this.capacity;
	}

	abstract public Bus build();
}
