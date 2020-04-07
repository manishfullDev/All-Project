package com.transport.api;

import com.transport.ashok.AshokGeneralPassengerBus;
import com.transport.benz.BenzVolvoBus;
import com.transport.benz.BenzVolvoBus.BenzBusBuilder;

public abstract class Bus {
	protected int busNo;
	protected String color;
	protected String manufacturer;
	protected String model;
	protected String rtaRegistrationNo;
	protected String chasisNo;
	protected String engineNo;
	protected String fuelType;
	protected int capacity;

	public abstract void drive();

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRtaRegistrationNo() {
		return rtaRegistrationNo;
	}

	public void setRtaRegistrationNo(String rtaRegistrationNo) {
		this.rtaRegistrationNo = rtaRegistrationNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
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

	public static BusBuilder newBusBuilder(String provider, int busNo, String manufacturer, String model,
			String rtaRegistrationNo) {
		BusBuilder builder = null;

		if (provider.equals("benz")) {
			builder = new BenzVolvoBus.BenzBusBuilder(busNo, manufacturer, model, rtaRegistrationNo);
		} else if (provider.equals("ashok")) {
			builder = new AshokGeneralPassengerBus.AshokBusBuilder(busNo, manufacturer, model, rtaRegistrationNo);
		}
		return builder;
	}

	static public abstract class BusBuilder {
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
}
