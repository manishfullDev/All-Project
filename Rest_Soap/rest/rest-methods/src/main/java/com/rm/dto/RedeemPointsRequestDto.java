package com.rm.dto;

import java.io.Serializable;
import java.util.Date;

public class RedeemPointsRequestDto implements Serializable {
	protected String paybackCardNo;
	protected String invoiceNo;
	protected String billingCustomerName;
	protected double invoiceAmount;
	protected int pin;

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

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
