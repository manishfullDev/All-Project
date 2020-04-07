package com.rm.dto;

import java.io.Serializable;

public class NewMemberRequestDto implements Serializable {
	protected String cardHolderName;
	protected String mobileNo;
	protected String emailAddress;
	protected String gender;
	protected int age;
	protected String referralMerchantUniqueIdentificationCode;
	protected String status;

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReferralMerchantUniqueIdentificationCode() {
		return referralMerchantUniqueIdentificationCode;
	}

	public void setReferralMerchantUniqueIdentificationCode(String referralMerchantUniqueIdentificationCode) {
		this.referralMerchantUniqueIdentificationCode = referralMerchantUniqueIdentificationCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
