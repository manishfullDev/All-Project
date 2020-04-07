package com.slc.entities;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
	protected int companyNo;
	protected String businessName;
	protected Date establishedDate;
	protected String contactNo;
	protected String emailAddress;
	protected String hrRepresentativeName;

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
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

	public String getHrRepresentativeName() {
		return hrRepresentativeName;
	}

	public void setHrRepresentativeName(String hrRepresentativeName) {
		this.hrRepresentativeName = hrRepresentativeName;
	}

	@Override
	public String toString() {
		return "Company [companyNo=" + companyNo + ", businessName=" + businessName + ", establishedDate="
				+ establishedDate + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress
				+ ", hrRepresentativeName=" + hrRepresentativeName + "]";
	}
	
	

}
