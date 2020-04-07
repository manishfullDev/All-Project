package com.tpcc.entities;

public class LifeInsurancePolicy extends InsurancePolicy {
	protected double premiumAmount;
	protected String paymentCycle;
	protected double maturityAmount;

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPaymentCycle() {
		return paymentCycle;
	}

	public void setPaymentCycle(String paymentCycle) {
		this.paymentCycle = paymentCycle;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	@Override
	public String toString() {
		return "LifeInsurancePolicy [premiumAmount=" + premiumAmount + ", paymentCycle=" + paymentCycle
				+ ", maturityAmount=" + maturityAmount + ", policyNo=" + policyNo + ", policyHolderName="
				+ policyHolderName + ", effectiveDate=" + effectiveDate + ", endDate=" + endDate + ", insurredAmount="
				+ insurredAmount + "]";
	}

}
