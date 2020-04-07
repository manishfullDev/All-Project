package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.EnquireLoanAgent;
import com.don.vo.LoanEnquiry;
import com.don.vo.LoanSummary;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/don/common/application-context.xml"));
		EnquireLoanAgent enquireLoanAgent = factory.getBean("enquireLoanAgent", EnquireLoanAgent.class);
		LoanEnquiry loanEnquiry = new LoanEnquiry(600000, 36, "personalLoan", "hyderabad");
		LoanSummary loanSummary = enquireLoanAgent.enquire(loanEnquiry);
		System.out.println(loanSummary);
	}
}
