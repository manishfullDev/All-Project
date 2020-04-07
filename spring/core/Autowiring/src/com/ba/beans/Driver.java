package com.ba.beans;

public class Driver {
	private String driverName;
	private String contactNo;

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", contactNo=" + contactNo + "]";
	}

}
