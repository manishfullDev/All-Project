package com.views.dto;

public class BusProvidersDto {
	protected String businessName;
	protected String contactNo;
	protected String emailAddress;

	public BusProvidersDto(String businessName, String contactNo, String emailAddress) {
		super();
		this.businessName = businessName;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
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

}
