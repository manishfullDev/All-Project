package com.ja.service;

import java.util.UUID;

public class NeftFundsTransferService implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, double amount, String remarks) {
		return "NEFT-" + UUID.randomUUID().toString();
	}

}
