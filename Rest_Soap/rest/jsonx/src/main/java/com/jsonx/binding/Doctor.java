package com.jsonx.binding;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder(value = { "doctorName", "age", "experience", "gender", "qualification", "specialization",
		"address" })
public class Doctor {
	protected String doctorName;
	protected int experience;
	protected int age;
	protected String gender;
	protected String qualification;
	protected String[] specialization;
	protected Address address;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String[] specialization) {
		this.specialization = specialization;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
