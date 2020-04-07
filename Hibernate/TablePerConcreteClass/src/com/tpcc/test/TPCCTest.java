package com.tpcc.test;

import java.util.Date;

import com.tpcc.accessor.InsuranceAccessor;
import com.tpcc.entities.AccidentalInsurancePolicy;
import com.tpcc.entities.InsurancePolicy;
import com.tpcc.entities.LifeInsurancePolicy;

public class TPCCTest {
	public static void main(String[] args) {
		InsuranceAccessor insuranceAccessor = null;
		AccidentalInsurancePolicy accidentalInsurancePolicy = null;
		LifeInsurancePolicy lifeInsurancePolicy = null;
		
		insuranceAccessor = new InsuranceAccessor();
		/*accidentalInsurancePolicy = new AccidentalInsurancePolicy();
		accidentalInsurancePolicy.setPolicyHolderName("Mathew");
		accidentalInsurancePolicy.setEffectiveDate(new Date());
		accidentalInsurancePolicy.setEndDate(new Date());
		accidentalInsurancePolicy.setInsurredAmount(102933);
		accidentalInsurancePolicy.setInternationalCoverage(true);
		accidentalInsurancePolicy.setDisabilityCoveragePercentage(70);
		
		int policyNo = insuranceAccessor.saveInsurancePolicy(accidentalInsurancePolicy);*/
		/*lifeInsurancePolicy = new LifeInsurancePolicy();
		lifeInsurancePolicy.setPolicyHolderName("Williams");
		lifeInsurancePolicy.setEffectiveDate(new Date());
		lifeInsurancePolicy.setEndDate(new Date());
		lifeInsurancePolicy.setInsurredAmount(192933);
		lifeInsurancePolicy.setPaymentCycle("Half Yearly");
		lifeInsurancePolicy.setPremiumAmount(3000);
		lifeInsurancePolicy.setMaturityAmount(250000);
		int policyNo = insuranceAccessor.saveInsurancePolicy(lifeInsurancePolicy);
		
		System.out.println("Policy No : " + policyNo);*/
		
		InsurancePolicy insurancePolicy = insuranceAccessor.getInsurancePolicy(InsurancePolicy.class, 1);
		System.out.println(insurancePolicy);
		
	}
}





















