package com.ba.beans;

public class Cab {
	private Driver driver;
	private Ride ride;

	public Cab(Driver driver) {
		this.driver = driver;
	}

	public Cab(Ride ride) {
		this.ride = ride;
	}

	@Override
	public String toString() {
		return "Cab [driver=" + driver + ", ride=" + ride + "]";
	}

}
