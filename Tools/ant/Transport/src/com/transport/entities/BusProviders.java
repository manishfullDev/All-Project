package com.transport.entities;

import java.io.Serializable;
import java.util.Date;

public class BusProviders implements Serializable {
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String primaryBusinessContactNo;
	protected String primaryBusinessEmailAddress;
	protected String status;

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getAssociatedDate() {
		return associatedDate;
	}

	public void setAssociatedDate(Date associatedDate) {
		this.associatedDate = associatedDate;
	}

	public String getPrimaryBusinessContactNo() {
		return primaryBusinessContactNo;
	}

	public void setPrimaryBusinessContactNo(String primaryBusinessContactNo) {
		this.primaryBusinessContactNo = primaryBusinessContactNo;
	}

	public String getPrimaryBusinessEmailAddress() {
		return primaryBusinessEmailAddress;
	}

	public void setPrimaryBusinessEmailAddress(String primaryBusinessEmailAddress) {
		this.primaryBusinessEmailAddress = primaryBusinessEmailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BusProviders [busProviderId=" + busProviderId + ", businessName=" + businessName + ", associatedDate="
				+ associatedDate + ", primaryBusinessContactNo=" + primaryBusinessContactNo
				+ ", primaryBusienssEmailAddress=" + primaryBusinessEmailAddress + ", status=" + status + "]";
	}

}
