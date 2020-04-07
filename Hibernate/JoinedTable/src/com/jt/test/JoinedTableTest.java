package com.jt.test;

import com.jt.accessor.AdmissionAccessor;
import com.jt.entities.GeneralAdmission;

public class JoinedTableTest {
	public static void main(String[] args) {
		AdmissionAccessor admissionAccessor = new AdmissionAccessor();
		
		  /*GeneralAdmission generalAdmission = new GeneralAdmission();
		  generalAdmission.setAdmittedDate(new Date()); generalAdmission.setAge(23);
		  generalAdmission.setPatientName("Subbu"); generalAdmission.setGender("Male");
		  generalAdmission.setReferredDoctorName("Krithi"); int admissionNo =
		  admissionAccessor.saveAdmission(generalAdmission);
		  System.out.println("admissionNo : " + admissionNo);*/
		 
		
		  /*CriticalCareAdmission careAdmission = new CriticalCareAdmission();
		  careAdmission.setAdmittedDate(new Date()); careAdmission.setAge(23);
		  careAdmission.setPatientName("Raju"); careAdmission.setGender("Male");
		  careAdmission.setReferredDoctorName("Raheem");
		  careAdmission.setReasonForAdmission("Critically Ill");
		  careAdmission.setSeverityOfProblem("High");
		  careAdmission.setEstimatedCriticalCareSupportInHours(24); int admissionNo =
		  admissionAccessor.saveAdmission(careAdmission);
		  System.out.println("admissionNo : " + admissionNo);*/
		 

		
		 /* IntensiveCareAdmission intensiveCareAdmission = new IntensiveCareAdmission();
		  intensiveCareAdmission.setAdmittedDate(new Date());
		  intensiveCareAdmission.setAge(23);
		  intensiveCareAdmission.setPatientName("Raju");
		  intensiveCareAdmission.setGender("Male");
		  intensiveCareAdmission.setReferredDoctorName("Raheem");
		  intensiveCareAdmission.setChancesOfSurvival(50);
		  intensiveCareAdmission.setInChargeDoctorName("Robert");
		  intensiveCareAdmission.setMedicalSupportLevel(2);
		  intensiveCareAdmission.setMonitoringFrequencyInMinutues(15); int admissionNo
		  = admissionAccessor.saveAdmission(intensiveCareAdmission);
		  System.out.println("admissionNo : " + admissionNo);*/
		 

		/*CriticalCareAdmission admission = (CriticalCareAdmission) admissionAccessor
				.getAdmission(CriticalCareAdmission.class, 2);
		System.out.println(admission);*/
		
		GeneralAdmission admission = admissionAccessor.getAdmission(GeneralAdmission.class, 2);
		System.out.println(admission);
	}
}












