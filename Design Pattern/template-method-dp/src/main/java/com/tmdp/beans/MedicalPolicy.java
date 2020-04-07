package com.tmdp.beans;

import java.util.Date;

public class MedicalPolicy {
	protected String medicalPolicyNo;
	protected String policyHolderName;
	protected int age;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	protected String policyType;
	protected double sumInsurred;
	protected int copay;
	protected Date effectiveDate;
	protected Date endDate;
	protected String status;

	public String getMedicalPolicyNo() {
		return medicalPolicyNo;
	}

	public void setMedicalPolicyNo(String medicalPolicyNo) {
		this.medicalPolicyNo = medicalPolicyNo;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getSumInsurred() {
		return sumInsurred;
	}

	public void setSumInsurred(double sumInsurred) {
		this.sumInsurred = sumInsurred;
	}

	public int getCopay() {
		return copay;
	}

	public void setCopay(int copay) {
		this.copay = copay;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
