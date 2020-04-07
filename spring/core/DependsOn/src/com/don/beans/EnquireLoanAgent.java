package com.don.beans;

import java.util.Properties;

import com.don.helper.Cache;
import com.don.vo.LoanEnquiry;
import com.don.vo.LoanSummary;

public class EnquireLoanAgent {
	private Cache cache;

	public LoanSummary enquire(LoanEnquiry enquiry) {
		LoanSummary loanSummary = null;
		Properties props = null;
		double interestRate = 0;
		double interestAmount = 0;
		double repaymentAmount = 0;
		double emiAmount = 0;

		props = (Properties) cache.get(enquiry.getLoanType());
		interestRate = Double.parseDouble(props.getProperty(enquiry.getPlace()));

		interestAmount = (enquiry.getLoanAmount() * (enquiry.getTenure()/12) * interestRate) / 100;
		repaymentAmount = enquiry.getLoanAmount() + interestAmount;
		emiAmount = repaymentAmount / enquiry.getTenure();
		loanSummary = new LoanSummary(enquiry.getLoanAmount(), enquiry.getTenure(), interestRate, interestAmount,
				repaymentAmount, emiAmount);

		return loanSummary;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
