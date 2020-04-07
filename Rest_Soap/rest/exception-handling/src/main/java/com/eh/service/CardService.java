package com.eh.service;

import java.util.UUID;

import com.eh.dto.PayCardRequest;
import com.eh.dto.Receipt;
import com.eh.exception.CardNotFoundException;

public class CardService {

	public Receipt pay(PayCardRequest request) {
		Receipt receipt = null;

		if (request.getCardNo().startsWith("4")) {
			throw new CardNotFoundException("No Card Found for the card no");
		}
		receipt = new Receipt();
		receipt.setTxNo(UUID.randomUUID().toString());
		receipt.setDescription("transfered amount to your card");
		receipt.setStatus("OK");
		return receipt;
	}

}
