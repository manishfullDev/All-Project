package com.npjt.bo;

import java.io.Serializable;
import java.util.Date;

public class BusProviderBo implements Serializable {
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String primaryBusinessContactNo;
	protected String primaryBusinessEmailAddress;
	protected String status;

	public BusProviderBo() {
		super();
	}

	public BusProviderBo(int busProviderId, String businessName, Date associatedDate, String primaryBusinessContactNo,
			String primaryBusinessEmailAddress, String status) {
		this.busProviderId = busProviderId;
		this.businessName = businessName;
		this.associatedDate = associatedDate;
		this.primaryBusinessContactNo = primaryBusinessContactNo;
		this.primaryBusinessEmailAddress = primaryBusinessEmailAddress;
		this.status = status;
	}

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
		return "BusProviderBo [busProviderId=" + busProviderId + ", businessName=" + businessName + ", associatedDate="
				+ associatedDate + ", primaryBusinessContactNo=" + primaryBusinessContactNo
				+ ", primaryBusinessEmailAddress=" + primaryBusinessEmailAddress + ", status=" + status + "]";
	}

}
