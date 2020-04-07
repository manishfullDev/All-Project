package com.ri.paramconverter.resource;

import java.io.Serializable;

public class AccountNo implements Serializable {
	protected String branchCode;
	protected String accountType;
	protected String uniqueAccountNo;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getUniqueAccountNo() {
		return uniqueAccountNo;
	}

	public void setUniqueAccountNo(String uniqueAccountNo) {
		this.uniqueAccountNo = uniqueAccountNo;
	}

}
