package com.fw.service;

import com.fw.bo.Applicant;
import com.fw.bo.LoanDocument;

public interface LoanService {
	String applyLoan(LoanDocument document, Applicant applicant);
}
