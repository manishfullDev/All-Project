package com.fw.service;

import java.util.UUID;

import com.fw.bo.Applicant;
import com.fw.bo.LoanDocument;

public class HomeLoanService implements LoanService {

	@Override
	public String applyLoan(LoanDocument document, Applicant applicant) {
		System.out.println("hash : " + this.hashCode());
		return UUID.randomUUID().toString();
	}

}
