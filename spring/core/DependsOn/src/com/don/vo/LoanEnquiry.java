package com.don.vo;

public class LoanEnquiry {
	private double loanAmount;
	private int tenure;
	private String loanType;
	private String place;

	public LoanEnquiry(double loanAmount, int tenure, String loanType, String place) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.loanType = loanType;
		this.place = place;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
