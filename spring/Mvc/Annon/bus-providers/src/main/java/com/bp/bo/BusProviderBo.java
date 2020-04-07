package com.bp.bo;

import java.util.Date;

public class BusProviderBo {
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String primaryBusinessContactNo;
	protected String priarmyBusinessEmailAddress;
	protected String status;

	public BusProviderBo(int busProviderId, String businessName, Date associatedDate, String primaryBusinessContactNo,
			String priarmyBusinessEmailAddress, String status) {
		super();
		this.busProviderId = busProviderId;
		this.businessName = businessName;
		this.associatedDate = associatedDate;
		this.primaryBusinessContactNo = primaryBusinessContactNo;
		this.priarmyBusinessEmailAddress = priarmyBusinessEmailAddress;
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

	public String getPriarmyBusinessEmailAddress() {
		return priarmyBusinessEmailAddress;
	}

	public void setPriarmyBusinessEmailAddress(String priarmyBusinessEmailAddress) {
		this.priarmyBusinessEmailAddress = priarmyBusinessEmailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
