package com.rc.dto;

public class Account {
	protected int accountNo;
	protected String registeredMobileNo;
	protected String emailAddress;
	protected String accountHolderName;
	protected String status;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getRegisteredMobileNo() {
		return registeredMobileNo;
	}

	public void setRegisteredMobileNo(String registeredMobileNo) {
		this.registeredMobileNo = registeredMobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", registeredMobileNo=" + registeredMobileNo + ", emailAddress="
				+ emailAddress + ", accountHolderName=" + accountHolderName + ", status=" + status + "]";
	}

}
