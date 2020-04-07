package com.tmdp.service;

import java.util.Date;
import java.util.UUID;

import com.tmdp.beans.ClaimStatus;
import com.tmdp.beans.MedicalPolicy;
import com.tmdp.beans.MedicalReport;

abstract public class ClaimService {
	public ClaimStatus applyClaim(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		ClaimStatus claimStatus = null;
		double issuedAmount = 0.0;
		boolean isDuplicate = false;
		boolean isPolicyInForce = false;
		boolean eligibilityCheck = false;
		boolean healthRecordCheck = false;
		boolean medicalPolicyCheckPassed = false;

		claimStatus = new ClaimStatus();
		claimStatus.setAdmissionNo(medicalReport.getAdmissionNo());
		claimStatus.setHospitalName(medicalReport.getHospitalName());
		claimStatus.setPatientName(medicalReport.getPatientName());
		claimStatus.setClaimedAmount(medicalReport.getAmount());
		claimStatus.setClaimNo(UUID.randomUUID().toString());

		medicalPolicyCheckPassed = checkMedicalPolicy(medicalPolicy);
		if (medicalPolicyCheckPassed == false) {
			claimStatus.setComments("Your medical policy is not valid");
			claimStatus.setStatus("Rejected");
			return claimStatus;
		}
		isPolicyInForce = isPolicyInForce(medicalPolicy);
		if (isPolicyInForce == false) {
			claimStatus.setComments("policy expired");
			claimStatus.setStatus("Rejected");
			return claimStatus;
		}
		healthRecordCheck = healthRecordsCheck(medicalPolicy, medicalReport);
		if (healthRecordCheck == false) {
			claimStatus.setComments("health records not matching");
			claimStatus.setStatus("Rejected");
			return claimStatus;
		}
		isDuplicate = isDuplicateClaim(medicalReport);
		if (isDuplicate == true) {
			claimStatus.setComments("already claim submitted and pending with us");
			claimStatus.setStatus("Rejected");
			return claimStatus;
		}
		eligibilityCheck = checkEligibility(medicalPolicy, medicalReport);
		if (eligibilityCheck == false) {
			claimStatus.setComments("Failed to meet eligibility criteria");
			claimStatus.setStatus("Rejected");
			return claimStatus;
		}

		issuedAmount = getReimbursableAmount(medicalPolicy, medicalReport);
		claimStatus.setIssuedAmount(issuedAmount);
		claimStatus.setComments("approved");
		claimStatus.setStatus("approved");

		return claimStatus;
	}

	protected abstract boolean checkMedicalPolicy(MedicalPolicy medicalPolicy);

	protected boolean isPolicyInForce(MedicalPolicy medicalPolicy) {
		boolean flag = false;
		Date today = null;

		today = new Date();
		if (today.after(medicalPolicy.getEffectiveDate()) && today.before(medicalPolicy.getEndDate())
				&& medicalPolicy.getStatus().equals("A")) {
			flag = true;
		}

		return flag;
	}

	protected boolean healthRecordsCheck(MedicalPolicy medicalPolicy, MedicalReport medicalReport) {
		boolean flag = false;

		if (medicalPolicy.getPolicyHolderName().equals(medicalReport.getPatientName())
				&& medicalPolicy.getAge() == medicalReport.getAge()
				&& medicalPolicy.getGender().equals(medicalReport.getGender())) {
			flag = true;
		}

		return flag;
	}

	abstract protected boolean isQuoteAvailable(MedicalPolicy medicalPolicy, MedicalReport medicalReport);

	protected boolean isDuplicateClaim(MedicalReport medicalReport) {
		return false;
	}

	abstract protected boolean checkEligibility(MedicalPolicy medicalPolicy, MedicalReport medicalReport);

	abstract protected double getReimbursableAmount(MedicalPolicy medicalPolicy, MedicalReport medicalReport);

}
