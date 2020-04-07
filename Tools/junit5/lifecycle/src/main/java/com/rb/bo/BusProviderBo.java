package com.rb.bo;

import java.util.Date;

public class BusProviderBo {
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String primaryBusinessContactNo;
	protected String primaryBusinessEmailAddress;
	protected String status;

	public BusProviderBo(int busProviderId, String businessName, Date associatedDate, String primaryBusinessContactNo,
			String primaryBusinessEmailAddress, String status) {
		this.busProviderId = busProviderId;
		this.businessName = businessName;
		this.associatedDate = associatedDate;
		this.primaryBusinessContactNo = primaryBusinessContactNo;
		this.primaryBusinessEmailAddress = primaryBusinessEmailAddress;
		this.status = status;
	}

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getAssociatedDate() {
		return associatedDate;
	}

	public void setAssociatedDate(Date associatedDate) {
		this.associatedDate = associatedDate;
	}

	public String getPrimaryBusinessContactNo() {
		return primaryBusinessContactNo;
	}

	public void setPrimaryBusinessContactNo(String primaryBusinessContactNo) {
		this.primaryBusinessContactNo = primaryBusinessContactNo;
	}

	public String getPrimaryBusinessEmailAddress() {
		return primaryBusinessEmailAddress;
	}

	public void setPrimaryBusinessEmailAddress(String primaryBusinessEmailAddress) {
		this.primaryBusinessEmailAddress = primaryBusinessEmailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associatedDate == null) ? 0 : associatedDate.hashCode());
		result = prime * result + busProviderId;
		result = prime * result + ((businessName == null) ? 0 : businessName.hashCode());
		result = prime * result + ((primaryBusinessContactNo == null) ? 0 : primaryBusinessContactNo.hashCode());
		result = prime * result + ((primaryBusinessEmailAddress == null) ? 0 : primaryBusinessEmailAddress.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusProviderBo other = (BusProviderBo) obj;
		if (associatedDate == null) {
			if (other.associatedDate != null)
				return false;
		} else if (!associatedDate.equals(other.associatedDate))
			return false;
		if (busProviderId != other.busProviderId)
			return false;
		if (businessName == null) {
			if (other.businessName != null)
				return false;
		} else if (!businessName.equals(other.businessName))
			return false;
		if (primaryBusinessContactNo == null) {
			if (other.primaryBusinessContactNo != null)
				return false;
		} else if (!primaryBusinessContactNo.equals(other.primaryBusinessContactNo))
			return false;
		if (primaryBusinessEmailAddress == null) {
			if (other.primaryBusinessEmailAddress != null)
				return false;
		} else if (!primaryBusinessEmailAddress.equals(other.primaryBusinessEmailAddress))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
