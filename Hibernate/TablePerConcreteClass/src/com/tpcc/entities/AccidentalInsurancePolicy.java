package com.tpcc.entities;

public class AccidentalInsurancePolicy extends InsurancePolicy {
	protected boolean internationalCoverage;
	protected int disabilityCoveragePercentage;

	public boolean isInternationalCoverage() {
		return internationalCoverage;
	}

	public void setInternationalCoverage(boolean internationalCoverage) {
		this.internationalCoverage = internationalCoverage;
	}

	public int getDisabilityCoveragePercentage() {
		return disabilityCoveragePercentage;
	}

	public void setDisabilityCoveragePercentage(int disabilityCoveragePercentage) {
		this.disabilityCoveragePercentage = disabilityCoveragePercentage;
	}

	@Override
	public String toString() {
		return "AccidentalInsurancePolicy [internationalCoverage=" + internationalCoverage
				+ ", disabilityCoveragePercentage=" + disabilityCoveragePercentage + ", policyNo=" + policyNo
				+ ", policyHolderName=" + policyHolderName + ", effectiveDate=" + effectiveDate + ", endDate=" + endDate
				+ ", insurredAmount=" + insurredAmount + "]";
	}

}
