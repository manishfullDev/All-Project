package com.st.test;

import com.st.accessor.AdmissionAccessor;
import com.st.entities.GeneralAdmission;
import com.st.helper.EntityManagerFactoryHelper;

public class SingleTableTest {
	public static void main(String[] args) {
		AdmissionAccessor admissionAccessor = new AdmissionAccessor();

		/*
		 * GeneralAdmission generalAdmission = new GeneralAdmission();
		 * generalAdmission.setAdmittedDate(new Date()); generalAdmission.setAge(23);
		 * generalAdmission.setGender("Male"); generalAdmission.setPatientName("abc");
		 * generalAdmission.setReferredDoctorName("xyz"); int admissionNo =
		 * admissionAccessor.saveAdmission(generalAdmission);
		 * System.out.println("admission No : " + admissionNo);
		 */

		/*
		 * CriticalCareAdmission criticalCareAdmission = new CriticalCareAdmission();
		 * criticalCareAdmission.setAdmittedDate(new Date());
		 * criticalCareAdmission.setAge(23); criticalCareAdmission.setGender("Male");
		 * criticalCareAdmission.setPatientName("abc");
		 * criticalCareAdmission.setReferredDoctorName("xyz");
		 * criticalCareAdmission.setEstimatedCriticalCareSupportInHours(12);
		 * criticalCareAdmission.setSeverityOfProblem("High");
		 * criticalCareAdmission.setReasonForAdmission("In stable metrics"); int
		 * admissionNo = admissionAccessor.saveAdmission(criticalCareAdmission);
		 * System.out.println("admission No : " + admissionNo);
		 */

		/*
		 * IntensiveCareAdmission intensiveCareAdmission = new IntensiveCareAdmission();
		 * intensiveCareAdmission.setAdmittedDate(new Date());
		 * intensiveCareAdmission.setAge(22); intensiveCareAdmission.setGender("Male");
		 * intensiveCareAdmission.setPatientName("rahul");
		 * intensiveCareAdmission.setReferredDoctorName("ravi");
		 * intensiveCareAdmission.setInChargeDoctorName("ravi");
		 * intensiveCareAdmission.setMedicalSupportLevel(2);
		 * intensiveCareAdmission.setChancesOfSurvival(50);
		 * intensiveCareAdmission.setMonitoringFrequencyInMinutes(30);
		 * 
		 * 
		 * 
		 * int admissionNo = admissionAccessor.saveAdmission(intensiveCareAdmission);
		 * System.out.println("admission No : " + admissionNo);
		 */

		
		  GeneralAdmission generalAdmission =
		  admissionAccessor.getAdmission(GeneralAdmission.class, 2);
		  System.out.println(generalAdmission);
		 

		/*CriticalCareAdmission criticalCareAdmission = (CriticalCareAdmission) admissionAccessor
				.getAdmission(CriticalCareAdmission.class, 3);
		System.out.println(criticalCareAdmission);*/
		EntityManagerFactoryHelper.closeEntityManagerFactory();

	}
}
