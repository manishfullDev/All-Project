package com.rm.dto;

import java.io.Serializable;
import java.util.Date;

public class NewMemberResponseDto implements Serializable {
	protected String paybackCardNo;
	protected String cardHolderName;
	protected String mobileNo;
	protected Date issuedDate;
	protected String message;
	protected String status;

	public String getPaybackCardNo() {
		return paybackCardNo;
	}

	public void setPaybackCardNo(String paybackCardNo) {
		this.paybackCardNo = paybackCardNo;
	}

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

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
