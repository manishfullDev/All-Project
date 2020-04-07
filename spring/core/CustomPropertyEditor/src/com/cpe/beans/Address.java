package com.cpe.beans;

public class Address {
	private String host;
	private int port;

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Address [host=" + host + ", port=" + port + "]";
	}

}
