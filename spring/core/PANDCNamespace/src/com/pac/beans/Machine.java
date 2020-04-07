package com.pac.beans;

public class Machine {
	private int capacity;
	private String machineType;

	public Machine(int capacity, String machineType) {
		this.capacity = capacity;
		this.machineType = machineType;
	}

	@Override
	public String toString() {
		return "Machine [capacity=" + capacity + ", machineType=" + machineType + "]";
	}

}
