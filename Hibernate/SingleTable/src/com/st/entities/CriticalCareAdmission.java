package com.st.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("critical_care")
public class CriticalCareAdmission extends GeneralAdmission {
	@Column(name = "reason_for_admission")
	protected String reasonForAdmission;
	@Column(name = "severity_of_problem")
	protected String severityOfProblem;
	@Column(name = "estimated_critical_care_support_in_hours")
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
