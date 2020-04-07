package com.payment.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payment.axisbank.dto.Receipt;
import com.payment.dto.PaymentDto;
import com.payment.dto.ReceiptDto;
import com.payment.service.PaymentService;

public class PaymentTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/payment/common/application-context.xml");
		PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
		ReceiptDto receiptDto = null;
		PaymentDto paymentDto = new PaymentDto();
		paymentDto.setAccountNo("a303");
		paymentDto.setAccountType("Savings");
		paymentDto.setAmount(2522);
		paymentDto.setAtmNo("0393");
		paymentDto.setDebitCardNo("93338944");
		
		receiptDto = paymentService.withdraw(paymentDto);
		System.out.println(receiptDto);
	}
}
