package com.nc.beans;

public class Robot {
	private Sensor sensor;

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + "]";
	}

}
