package com.payment.service;

import com.payment.axis.service.Netbanking;
import com.payment.axisbank.dto.Receipt;
import com.payment.axisbank.dto.WithdrawlInfo;
import com.payment.dto.PaymentDto;
import com.payment.dto.ReceiptDto;

public class PaymentService {
	private Netbanking netbanking;

	public ReceiptDto withdraw(PaymentDto paymentDto) {
		Receipt receipt = null;
		WithdrawlInfo withdrawlInfo = null;
		ReceiptDto receiptDto = null;

		withdrawlInfo = new WithdrawlInfo();
		withdrawlInfo.setAccountNo(paymentDto.getAccountNo());
		withdrawlInfo.setAccountType(paymentDto.getAccountType());
		withdrawlInfo.setAmount(paymentDto.getAmount());
		withdrawlInfo.setAtmNo(paymentDto.getAtmNo());
		withdrawlInfo.setDebitCardNo(paymentDto.getDebitCardNo());

		receipt = netbanking.withdrawl(withdrawlInfo);
		receiptDto = new ReceiptDto();
		receiptDto.setReferenceNo(receipt.getReferenceNo());
		receiptDto.setStatus(receipt.getStatus());

		return receiptDto;
	}

	public void setNetbanking(Netbanking netbanking) {
		this.netbanking = netbanking;
	}

}
