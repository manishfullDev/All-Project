package com.ig.entities;

import java.io.Serializable;
import java.util.Date;

public class Musician implements Serializable {
	protected String musicianId;
	protected String musicianName;
	protected String gender;
	protected Date dob;
	protected String instrument;
	protected int level;

	public String getMusicianId() {
		return musicianId;
	}

	public void setMusicianId(String musicianId) {
		this.musicianId = musicianId;
	}

	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Musician [musicianId=" + musicianId + ", musicianName=" + musicianName + ", gender=" + gender + ", dob="
				+ dob + ", instrument=" + instrument + ", level=" + level + "]";
	}

}
