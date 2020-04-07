package com.fw.service;

import java.util.UUID;

import com.fw.bo.Applicant;
import com.fw.bo.LoanDocument;

public class PersonalLoanService implements LoanService {

	@Override
	public String applyLoan(LoanDocument document, Applicant applicant) {
		System.out.println("hash : " + this.hashCode() + " loanType : " + document.getLoanType());
		return UUID.randomUUID().toString();
	}

}
