package com.tpc.test;

import java.util.Date;

import com.tpc.accessor.AdmissionAccessor;
import com.tpc.entities.CriticalCareAdmission;
import com.tpc.entities.GeneralAdmission;
import com.tpc.entities.IntensiveCareAdmission;

public class TPCHTest {
	public static void main(String[] args) {
		AdmissionAccessor admissionAccessor = new AdmissionAccessor();

		/*
		 * GeneralAdmission generalAdmission = new GeneralAdmission();
		 * generalAdmission.setAdmittedDate(new Date()); generalAdmission.setAge(23);
		 * generalAdmission.setGender("Male"); generalAdmission.setPatientName("abc");
		 * generalAdmission.setReferredDoctorName("xyz");
		 */
		/*CriticalCareAdmission criticalCareAdmission = new CriticalCareAdmission();
		criticalCareAdmission.setAdmittedDate(new Date());
		criticalCareAdmission.setAge(23);
		criticalCareAdmission.setGender("Male");
		criticalCareAdmission.setPatientName("abc");
		criticalCareAdmission.setReferredDoctorName("xyz");
		criticalCareAdmission.setEstimatedCriticalCareSupportInHours(12);
		criticalCareAdmission.setSeverityOfProblem("High");
		criticalCareAdmission.setReasonForAdmission("In stable metrics");*/
		
		/*IntensiveCareAdmission intensiveCareAdmission = new IntensiveCareAdmission();
		intensiveCareAdmission.setAdmittedDate(new Date());
		intensiveCareAdmission.setAge(22);
		intensiveCareAdmission.setGender("Male");
		intensiveCareAdmission.setPatientName("rahul");
		intensiveCareAdmission.setReferredDoctorName("ravi");
		intensiveCareAdmission.setInChargeDoctorName("ravi");
		intensiveCareAdmission.setMedicalSupportLevel(2);
		intensiveCareAdmission.setChancesOfSurvival(50);
		intensiveCareAdmission.setMonitoringFrequencyInMinutes(30);
		
		

		int admissionNo = admissionAccessor.saveAdmission(intensiveCareAdmission);
		System.out.println("admission No : " + admissionNo);*/
		
		GeneralAdmission generalAdmission = admissionAccessor.getAdmission(GeneralAdmission.class, 2);
		System.out.println(generalAdmission);
		
		/*CriticalCareAdmission criticalCareAdmission = (CriticalCareAdmission) admissionAccessor.getAdmission(CriticalCareAdmission.class, 3);
		System.out.println(criticalCareAdmission);*/
	}
}






















