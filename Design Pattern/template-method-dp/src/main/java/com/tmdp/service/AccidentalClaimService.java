package com.tmdp.service;

import com.tmdp.beans.MedicalPolicy;
import com.tmdp.beans.MedicalReport;

public class AccidentalClaimService extends ClaimService {

	@Override
	protected boolean checkMedicalPolicy(MedicalPolicy medicalPolicy) {
		boolean flag = false;
		if (medicalPolicy.getMedicalPolicyNo() != null && medicalPolicy.getMedicalPolicyNo().trim().length() == 18) {
			flag = true;
		}
		return flag;
	}

	@Override
	protected boolean isQuoteAvailable(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		return true;
	}

	@Override
	protected boolean checkEligibility(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		return true;
	}

	@Override
	protected double getReimbursableAmount(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		return medicalReport.getAmount();
	}

}
