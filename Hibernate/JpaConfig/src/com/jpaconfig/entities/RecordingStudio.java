package com.jpaconfig.entities;

import java.io.Serializable;
import java.util.Date;

public class RecordingStudio implements Serializable {
	protected int recordingStudioId;
	protected String studioName;
	protected Date establishedDate;
	protected String streetAddress;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	protected String contactNo;
	protected String emailAddress;

	public RecordingStudio() {
		super();
	}

	public RecordingStudio(int recordingStudioId, String studioName, Date establishedDate, String streetAddress,
			String city, String state, int zip, String country, String contactNo, String emailAddress) {
		super();
		this.recordingStudioId = recordingStudioId;
		this.studioName = studioName;
		this.establishedDate = establishedDate;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
	}

	public int getRecordingStudioId() {
		return recordingStudioId;
	}

	public void setRecordingStudioId(int recordingStudioId) {
		this.recordingStudioId = recordingStudioId;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "RecordingStudio [recordingStudioId=" + recordingStudioId + ", studioName=" + studioName
				+ ", establishedDate=" + establishedDate + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + "]";
	}

}
