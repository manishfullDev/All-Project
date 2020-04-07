package com.tmdp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tmdp.beans.ClaimStatus;
import com.tmdp.beans.MedicalPolicy;
import com.tmdp.beans.MedicalReport;
import com.tmdp.service.ClaimService;
import com.tmdp.service.MedicalClaimService;

public class TMDPTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		MedicalPolicy medicalPolicy = null;
		MedicalReport medicalReport = null;
		ClaimStatus claimStatus = null;
		ClaimService claimService = null;

		medicalPolicy = new MedicalPolicy();
		medicalPolicy.setMedicalPolicyNo("p300ji30km393491");
		medicalPolicy.setPolicyType("Medical");
		medicalPolicy.setPolicyHolderName("Susan");
		medicalPolicy.setAge(23);
		medicalPolicy.setGender("Female");
		medicalPolicy.setMobileNo("03940498404");
		medicalPolicy.setEmailAddress("susan@gmail.com");
		medicalPolicy.setCopay(10);
		medicalPolicy.setEffectiveDate(sdf.parse("01-01-2019"));
		medicalPolicy.setEndDate(sdf.parse("31-12-2019"));
		medicalPolicy.setStatus("A");
		medicalPolicy.setSumInsurred(500000);

		medicalReport = new MedicalReport();
		medicalReport.setAdmissionNo("ab309");
		medicalReport.setHospitalName("Yashoda");
		medicalReport.setPatientName("Susan");
		medicalReport.setAge(23);
		medicalReport.setGender("Female");
		medicalReport.setAppointedDate(sdf.parse("23-03-2019"));
		medicalReport.setDischargeDate(sdf.parse("28-03-2019"));
		medicalReport.setTreatments(new String[] { "maleria" });
		medicalReport.setSummary("recovered and healty");
		medicalReport.setStatus("Approved");
		medicalReport.setAmount(20000);

		claimService = new MedicalClaimService();
		claimStatus = claimService.applyClaim(medicalPolicy, medicalReport);
		System.out.println(claimStatus);

	}

}
