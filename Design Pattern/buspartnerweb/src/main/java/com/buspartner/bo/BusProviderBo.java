package com.buspartner.bo;

import java.io.Serializable;
import java.util.Date;

public class BusProviderBo implements Serializable {
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String contactNo;
	protected String emailAddress;
	protected String status;

	public BusProviderBo(int busProviderId, String businessName, Date associatedDate, String contactNo,
			String emailAddress, String status) {
		this.busProviderId = busProviderId;
		this.businessName = businessName;
		this.associatedDate = associatedDate;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
