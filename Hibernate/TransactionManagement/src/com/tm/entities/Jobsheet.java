package com.tm.entities;

import java.io.Serializable;
import java.util.Date;

public class Jobsheet implements Serializable {
	protected int jobsheetNo;
	protected Date openedDate;
	protected String vehicleNo;
	protected String description;
	protected Date estimatedDeliveryDate;
	protected float estimatedAmount;
	protected String status;

	public int getJobsheetNo() {
		return jobsheetNo;
	}

	public void setJobsheetNo(int jobsheetNo) {
		this.jobsheetNo = jobsheetNo;
	}

	public Date getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public float getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(float estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Jobsheet [jobsheetNo=" + jobsheetNo + ", openedDate=" + openedDate + ", vehicleNo=" + vehicleNo
				+ ", description=" + description + ", estimatedDeliveryDate=" + estimatedDeliveryDate
				+ ", estimatedAmount=" + estimatedAmount + ", status=" + status + "]";
	}

}
