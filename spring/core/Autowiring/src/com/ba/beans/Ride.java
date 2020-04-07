package com.ba.beans;

public class Ride {
	private String source;
	private String destination;

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Ride [source=" + source + ", destination=" + destination + "]";
	}

}
