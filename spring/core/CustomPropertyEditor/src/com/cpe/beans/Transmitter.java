package com.cpe.beans;

public class Transmitter {
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Transmitter [address=" + address + "]";
	}

}
