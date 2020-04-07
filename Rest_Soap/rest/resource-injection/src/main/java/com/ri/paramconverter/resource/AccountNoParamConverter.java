package com.ri.paramconverter.resource;

import javax.ws.rs.ext.ParamConverter;

public class AccountNoParamConverter implements ParamConverter<AccountNo> {

	@Override
	public AccountNo fromString(String value) {
		String branchCode = null;
		String accountType = null;
		String uniqueAccountNo = null;
		AccountNo accountNo = null;

		branchCode = value.substring(0, 5);
		accountType = value.substring(5, 7);
		uniqueAccountNo = value.substring(7);
		accountNo = new AccountNo();
		accountNo.setBranchCode(branchCode);
		accountNo.setAccountType(accountType);
		accountNo.setUniqueAccountNo(uniqueAccountNo);

		return accountNo;
	}

	@Override
	public String toString(AccountNo value) {
		return value.getBranchCode() + value.getAccountType() + value.getUniqueAccountNo();
	}

}
