package com.tpc.entities;

public class IntensiveCareAdmission extends GeneralAdmission {
	protected String inChargeDoctorName;
	protected int chancesOfSurvival;
	protected int medicalSupportLevel;
	protected int monitoringFrequencyInMinutes;

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

	public int getMonitoringFrequencyInMinutes() {
		return monitoringFrequencyInMinutes;
	}

	public void setMonitoringFrequencyInMinutes(int monitoringFrequencyInMinutes) {
		this.monitoringFrequencyInMinutes = monitoringFrequencyInMinutes;
	}

	@Override
	public String toString() {
		return "IntensiveCareAdmission [inChargeDoctorName=" + inChargeDoctorName + ", chancesOfSurvival="
				+ chancesOfSurvival + ", medicalSupportLevel=" + medicalSupportLevel + ", monitoringFrequencyInMinutes="
				+ monitoringFrequencyInMinutes + "]";
	}

}
