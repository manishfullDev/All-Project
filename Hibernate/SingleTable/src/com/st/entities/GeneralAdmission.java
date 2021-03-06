package com.st.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "general_admission")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "admission_type")
@DiscriminatorValue("general")
public class GeneralAdmission implements Serializable {
	@Id
	@Column(name = "admission_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int admissionNo;
	@Column(name = "patient_nm")
	protected String patientName;
	@Column(name = "admitted_dt")
	protected Date admittedDate;
	protected int age;
	protected String gender;
	@Column(name = "referred_doctor_nm")
	protected String referredDoctorName;

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Date getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(Date admittedDate) {
		this.admittedDate = admittedDate;
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
		return "GeneralAdmission [admissionNo=" + admissionNo + ", patientName=" + patientName + ", admittedDate="
				+ admittedDate + ", age=" + age + ", gender=" + gender + ", referredDoctorName=" + referredDoctorName
				+ "]";
	}

}
