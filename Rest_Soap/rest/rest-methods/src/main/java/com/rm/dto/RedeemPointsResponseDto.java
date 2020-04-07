package com.rm.dto;

import java.io.Serializable;

public class RedeemPointsResponseDto implements Serializable {
	protected String paybackCardNo;
	protected String invoiceNo;
	protected String billingCustomerName;
	protected int pointsRedeemed;
	protected String redeemReferenceNo;
	protected String status;

	public String getPaybackCardNo() {
		return paybackCardNo;
	}

	public void setPaybackCardNo(String paybackCardNo) {
		this.paybackCardNo = paybackCardNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getBillingCustomerName() {
		return billingCustomerName;
	}

	public void setBillingCustomerName(String billingCustomerName) {
		this.billingCustomerName = billingCustomerName;
	}

	public int getPointsRedeemed() {
		return pointsRedeemed;
	}

	public void setPointsRedeemed(int pointsRedeemed) {
		this.pointsRedeemed = pointsRedeemed;
	}

	public String getRedeemReferenceNo() {
		return redeemReferenceNo;
	}

	public void setRedeemReferenceNo(String redeemReferenceNo) {
		this.redeemReferenceNo = redeemReferenceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
