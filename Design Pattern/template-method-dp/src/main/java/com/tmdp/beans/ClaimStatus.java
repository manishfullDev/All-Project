package com.tmdp.beans;

public class ClaimStatus {
	protected String claimNo;
	protected String admissionNo;
	protected String hospitalName;
	protected String patientName;
	protected double claimedAmount;
	protected double issuedAmount;
	protected String comments;
	protected String status;

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getClaimedAmount() {
		return claimedAmount;
	}

	public void setClaimedAmount(double claimedAmount) {
		this.claimedAmount = claimedAmount;
	}

	public double getIssuedAmount() {
		return issuedAmount;
	}

	public void setIssuedAmount(double issuedAmount) {
		this.issuedAmount = issuedAmount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClaimStatus [claimNo=" + claimNo + ", admissionNo=" + admissionNo + ", hospitalName=" + hospitalName
				+ ", patientName=" + patientName + ", claimedAmount=" + claimedAmount + ", issuedAmount=" + issuedAmount
				+ ", comments=" + comments + ", status=" + status + "]";
	}

}
