package com.don.vo;

public class LoanSummary {
	private double loanAmount;
	private int tenure;
	private double interestRate;
	private double interestAmount;
	private double repaymentAmount;
	private double emiAmount;

	public LoanSummary(double loanAmount, int tenure, double interestRate, double interestAmount,
			double repaymentAmount, double emiAmount) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.interestAmount = interestAmount;
		this.repaymentAmount = repaymentAmount;
		this.emiAmount = emiAmount;
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

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(double repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	@Override
	public String toString() {
		return "LoanSummary [loanAmount=" + loanAmount + ", tenure=" + tenure + ", interestRate=" + interestRate
				+ ", interestAmount=" + interestAmount + ", repaymentAmount=" + repaymentAmount + ", emiAmount="
				+ emiAmount + "]";
	}

}
