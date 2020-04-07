package com.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "artist", uniqueConstraints = { @UniqueConstraint(columnNames = { "artist_full_nm", "mobile_nbr" }) })
public class Artist implements Serializable {
	@Id
	@Column(name = "artist_id")
	protected int artistId;
	@Column(name = "artist_full_nm")
	protected String artistFullName;
	protected Date dob;
	protected String gender;
	@Column(name = "mobile_nbr")
	protected String mobileNo;
	@Column(name = "email_address")
	protected String emailAddress;
	@Column(name = "movies_acted")
	protected int moviesActed;
	protected String language;

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistFullName() {
		return artistFullName;
	}

	public void setArtistFullName(String artistFullName) {
		this.artistFullName = artistFullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getMoviesActed() {
		return moviesActed;
	}

	public void setMoviesActed(int moviesActed) {
		this.moviesActed = moviesActed;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistFullName=" + artistFullName + ", dob=" + dob + ", gender="
				+ gender + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", moviesActed=" + moviesActed
				+ ", language=" + language + "]";
	}

}
