package com.datajpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
final public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_no")
	protected int companyNo;
	@Column(name = "business_nm")
	protected String businessName;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "contact_no")
	protected String contactNo;
	@Column(name = "email_address")
	protected String emailAddress;
	@Column(name = "hr_representative_nm")
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
