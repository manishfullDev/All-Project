package com.tpc.entities;

public class CriticalCareAdmission extends GeneralAdmission {
	protected String reasonForAdmission;
	protected String severityOfProblem;
	protected int estimatedCriticalCareSupportInHours;

	public String getReasonForAdmission() {
		return reasonForAdmission;
	}

	public void setReasonForAdmission(String reasonForAdmission) {
		this.reasonForAdmission = reasonForAdmission;
	}

	public String getSeverityOfProblem() {
		return severityOfProblem;
	}

	public void setSeverityOfProblem(String severityOfProblem) {
		this.severityOfProblem = severityOfProblem;
	}

	public int getEstimatedCriticalCareSupportInHours() {
		return estimatedCriticalCareSupportInHours;
	}

	public void setEstimatedCriticalCareSupportInHours(int estimatedCriticalCareSupportInHours) {
		this.estimatedCriticalCareSupportInHours = estimatedCriticalCareSupportInHours;
	}

	@Override
	public String toString() {
		return "CriticalCareAdmission [reasonForAdmission=" + reasonForAdmission + ", severityOfProblem="
				+ severityOfProblem + ", estimatedCriticalCareSupportInHours=" + estimatedCriticalCareSupportInHours
				+ "]";
	}

}
