package com.rm.dto;

import java.io.Serializable;
import java.util.Date;

public class MemberDto implements Serializable {
	protected String paybackCardNo;
	protected String mobileNo;
	protected String cardHolderName;
	protected Date issuedDate;
	protected int totalPoints;
	protected long pointsInAmount;

	public String getPaybackCardNo() {
		return paybackCardNo;
	}

	public void setPaybackCardNo(String paybackCardNo) {
		this.paybackCardNo = paybackCardNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public long getPointsInAmount() {
		return pointsInAmount;
	}

	public void setPointsInAmount(long pointsInAmount) {
		this.pointsInAmount = pointsInAmount;
	}

}
