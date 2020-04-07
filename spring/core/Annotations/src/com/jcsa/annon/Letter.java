package com.jcsa.annon;

// no source code
public class Letter {
	private String subject;
	private String message;
	private Address address;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Letter [subject=" + subject + ", message=" + message + ", address=" + address + "]";
	}

}
