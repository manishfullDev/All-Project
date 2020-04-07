package com.payment.dto;

public class PaymentDto {
	protected String accountNo;
	protected String atmNo;
	protected String debitCardNo;
	protected int amount;
	protected String accountType;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAtmNo() {
		return atmNo;
	}

	public void setAtmNo(String atmNo) {
		this.atmNo = atmNo;
	}

	public String getDebitCardNo() {
		return debitCardNo;
	}

	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo = debitCardNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
