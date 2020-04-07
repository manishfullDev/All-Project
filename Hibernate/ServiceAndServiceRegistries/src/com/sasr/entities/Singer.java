package com.sasr.entities;

import java.io.Serializable;
import java.util.Date;

public class Singer implements Serializable {
	protected int singerId;
	protected String singerFullName;
	protected Date dob;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;
	protected String genereType;
	protected String language;

	public int getSingerId() {
		return singerId;
	}

	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}

	public String getSingerFullName() {
		return singerFullName;
	}

	public void setSingerFullName(String singerFullName) {
		this.singerFullName = singerFullName;
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

	public String getGenereType() {
		return genereType;
	}

	public void setGenereType(String genereType) {
		this.genereType = genereType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Singer [singerId=" + singerId + ", singerFullName=" + singerFullName + ", dob=" + dob + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", genereType=" + genereType
				+ ", language=" + language + "]";
	}

}
