package com.tmdp.service;

import com.tmdp.beans.MedicalPolicy;
import com.tmdp.beans.MedicalReport;

public class MedicalClaimService extends ClaimService {

	@Override
	protected boolean checkMedicalPolicy(MedicalPolicy medicalPolicy) {
		boolean flag = false;

		if (medicalPolicy.getMedicalPolicyNo() != null && medicalPolicy.getMedicalPolicyNo().trim().length() == 16) {
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
		boolean flag = true;

		for (String treatment : medicalReport.getTreatments()) {
			if (treatment.equals("cardio") || treatment.equals("cancer") || treatment.equals("liver")
					|| treatment.equals("dialysis")) {
				flag = false;
			}
		}

		return flag;
	}

	@Override
	protected double getReimbursableAmount(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		return medicalReport.getAmount() - (medicalReport.getAmount() * medicalPolicy.getCopay()) / 100;
	}

}
