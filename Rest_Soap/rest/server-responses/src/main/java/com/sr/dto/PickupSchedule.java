package com.sr.dto;

import java.util.Date;

public class PickupSchedule {
	protected int pickupRequestNo;
	protected String pickupAgentName;
	protected String pickupAgentMobileNo;
	protected Date pickupDateAndTime;

	public int getPickupRequestNo() {
		return pickupRequestNo;
	}

	public void setPickupRequestNo(int pickupRequestNo) {
		this.pickupRequestNo = pickupRequestNo;
	}

	public String getPickupAgentName() {
		return pickupAgentName;
	}

	public void setPickupAgentName(String pickupAgentName) {
		this.pickupAgentName = pickupAgentName;
	}

	public String getPickupAgentMobileNo() {
		return pickupAgentMobileNo;
	}

	public void setPickupAgentMobileNo(String pickupAgentMobileNo) {
		this.pickupAgentMobileNo = pickupAgentMobileNo;
	}

	public Date getPickupDateAndTime() {
		return pickupDateAndTime;
	}

	public void setPickupDateAndTime(Date pickupDateAndTime) {
		this.pickupDateAndTime = pickupDateAndTime;
	}

}
