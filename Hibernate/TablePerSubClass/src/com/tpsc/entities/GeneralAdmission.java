package com.tpsc.entities;

import java.io.Serializable;
import java.util.Date;

public class GeneralAdmission implements Serializable {
	protected int admissionNo;
	protected Date admittedDate;
	protected String patientName;
	protected int age;
	protected String gender;
	protected String referredDoctorName;

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public Date getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(Date admittedDate) {
		this.admittedDate = admittedDate;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReferredDoctorName() {
		return referredDoctorName;
	}

	public void setReferredDoctorName(String referredDoctorName) {
		this.referredDoctorName = referredDoctorName;
	}

	@Override
	public String toString() {
		return "GeneralAdmission [admissionNo=" + admissionNo + ", admittedDate=" + admittedDate + ", patientName="
				+ patientName + ", age=" + age + ", gender=" + gender + ", referredDoctorName=" + referredDoctorName
				+ "]";
	}

}
