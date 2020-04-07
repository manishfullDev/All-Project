package com.ja.service;

import java.util.UUID;

public class RTGSFundsTransferService implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, double amount, String remarks) {
		return "RTGS-" + UUID.randomUUID().toString();
	}

}
