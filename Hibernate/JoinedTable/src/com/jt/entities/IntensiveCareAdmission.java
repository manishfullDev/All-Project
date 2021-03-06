package com.jt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "intensive_care_admission")
@PrimaryKeyJoinColumn(referencedColumnName = "admission_no", foreignKey = @ForeignKey(name = "intensive_care_fk"), name = "intensive_care_admission_no")
public class IntensiveCareAdmission extends GeneralAdmission {
	@Column(name = "incharge_doctor_nm")
	protected String inChargeDoctorName;
	@Column(name = "chances_of_survival")
	protected int chancesOfSurvival;
	@Column(name = "medical_support_level")
	protected int medicalSupportLevel;
	@Column(name = "monitoring_frequency_in_minutes")
	protected int monitoringFrequencyInMinutues;

	public String getInChargeDoctorName() {
		return inChargeDoctorName;
	}

	public void setInChargeDoctorName(String inChargeDoctorName) {
		this.inChargeDoctorName = inChargeDoctorName;
	}

	public int getChancesOfSurvival() {
		return chancesOfSurvival;
	}

	public void setChancesOfSurvival(int chancesOfSurvival) {
		this.chancesOfSurvival = chancesOfSurvival;
	}

	public int getMedicalSupportLevel() {
		return medicalSupportLevel;
	}

	public void setMedicalSupportLevel(int medicalSupportLevel) {
		this.medicalSupportLevel = medicalSupportLevel;
	}

	public int getMonitoringFrequencyInMinutues() {
		return monitoringFrequencyInMinutues;
	}

	public void setMonitoringFrequencyInMinutues(int monitoringFrequencyInMinutues) {
		this.monitoringFrequencyInMinutues = monitoringFrequencyInMinutues;
	}

	@Override
	public String toString() {
		return "IntensiveCareAdmission [inChargeDoctorName=" + inChargeDoctorName + ", chancesOfSurvival="
				+ chancesOfSurvival + ", medicalSupportLevel=" + medicalSupportLevel
				+ ", monitoringFrequencyInMinutues=" + monitoringFrequencyInMinutues + "]";
	}

}
