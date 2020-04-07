package com.payment.dto;

public class ReceiptDto {
	protected String referenceNo;
	protected String status;

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ReceiptDto [referenceNo=" + referenceNo + ", status=" + status + "]";
	}

}
