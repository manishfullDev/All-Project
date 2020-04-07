package com.gvl.entities;

import java.io.Serializable;
import java.util.Date;

final public class Lyricist implements Serializable, ILyricist {
	protected int lyricistId;
	protected String lyricistName;
	protected Date dob;
	protected String gender;
	protected int songsWrote;
	protected String highestAward;

	public int getLyricistId() {
		return lyricistId;
	}

	public void setLyricistId(int lyricistId) {
		this.lyricistId = lyricistId;
	}

	public String getLyricistName() {
		return lyricistName;
	}

	public void setLyricistName(String lyricistName) {
		this.lyricistName = lyricistName;
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

	public int getSongsWrote() {
		return songsWrote;
	}

	public void setSongsWrote(int songsWrote) {
		this.songsWrote = songsWrote;
	}

	public String getHighestAward() {
		return highestAward;
	}

	public void setHighestAward(String highestAward) {
		this.highestAward = highestAward;
	}

	@Override
	public String toString() {
		return "Lyricist [lyricistId=" + lyricistId + ", lyricistName=" + lyricistName + ", dob=" + dob + ", gender="
				+ gender + ", songsWrote=" + songsWrote + ", highestAward=" + highestAward + "]";
	}

}
