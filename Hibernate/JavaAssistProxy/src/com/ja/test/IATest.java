package com.ja.test;

import com.ja.factory.SecurityFactory;
import com.ja.service.FundsTransferService;
import com.ja.service.NeftFundsTransferService;

public class IATest {
	public static void main(String[] args) {
		FundsTransferService fundsTransferService = (FundsTransferService) SecurityFactory
				.createSecuredObjects(FundsTransferService.class);
		String ref = fundsTransferService.transfer("039", "39", 939, "friend");
		System.out.println("ref : " + ref);
	}
}
