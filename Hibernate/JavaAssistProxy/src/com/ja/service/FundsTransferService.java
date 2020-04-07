package com.ja.service;

public interface FundsTransferService {
	String transfer(String fromAc, String toAc, double amount, String remarks);
}
