package com.annotations.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music_studio")

public class MusicStudio implements Serializable {
	@Id
	@Column(name = "music_studio_id")
	protected int musicStudioId;
	@Column(name = "studio_nm")
	protected String studioName;
	@Column(name = "established_dt")
	protected Date establishedDate;
	@Column(name = "contact_nbr")
	protected String contactNo;
	@Column(name = "email_address")
	protected String emailAddress;

	public int getMusicStudioId() {
		return musicStudioId;
	}

	public void setMusicStudioId(int musicStudioId) {
		this.musicStudioId = musicStudioId;
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
		return "MusicStudio [musicStudioId=" + musicStudioId + ", studioName=" + studioName + ", establishedDate="
				+ establishedDate + ", contactNo=" + contactNo + ", emailAddress=" + emailAddress + "]";
	}

}
