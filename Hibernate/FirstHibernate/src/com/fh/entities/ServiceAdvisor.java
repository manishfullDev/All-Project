package com.fh.entities;

import java.io.Serializable;
import java.util.Date;

public class ServiceAdvisor implements Serializable {
	protected int serviceAdvisorNo;
	protected String serviceAdvisorName;
	protected Date dob;
	protected String gender;
	protected int experience;
	protected String mobileNo;
	protected String emailAddress;

	public int getServiceAdvisorNo() {
		return serviceAdvisorNo;
	}

	public void setServiceAdvisorNo(int serviceAdvisorNo) {
		this.serviceAdvisorNo = serviceAdvisorNo;
	}

	public String getServiceAdvisorName() {
		return serviceAdvisorName;
	}

	public void setServiceAdvisorName(String serviceAdvisorName) {
		this.serviceAdvisorName = serviceAdvisorName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "ServiceAdvisor [serviceAdvisorNo=" + serviceAdvisorNo + ", serviceAdvisorName=" + serviceAdvisorName
				+ ", dob=" + dob + ", gender=" + gender + ", experience=" + experience + ", mobileNo=" + mobileNo
				+ ", emailAddress=" + emailAddress + "]";
	}

}
