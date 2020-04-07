package com.cch.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Trip")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Trip")
public class Trip {
	protected int tripNo;
	protected Date tripDate;
	protected int estimatedArrivalTimeInMinutes;
	protected double estimatedAmount;
	protected String driverName;
	protected String driverContactNo;
	protected String cabNo;
	protected int tripOtp;

	public int getTripNo() {
		return tripNo;
	}

	public void setTripNo(int tripNo) {
		this.tripNo = tripNo;
	}

	public Date getTripDate() {
		return tripDate;
	}

	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}

	public int getEstimatedArrivalTimeInMinutes() {
		return estimatedArrivalTimeInMinutes;
	}

	public void setEstimatedArrivalTimeInMinutes(int estimatedArrivalTimeInMinutes) {
		this.estimatedArrivalTimeInMinutes = estimatedArrivalTimeInMinutes;
	}

	public double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverContactNo() {
		return driverContactNo;
	}

	public void setDriverContactNo(String driverContactNo) {
		this.driverContactNo = driverContactNo;
	}

	public String getCabNo() {
		return cabNo;
	}

	public void setCabNo(String cabNo) {
		this.cabNo = cabNo;
	}

	public int getTripOtp() {
		return tripOtp;
	}

	public void setTripOtp(int tripOtp) {
		this.tripOtp = tripOtp;
	}

}
