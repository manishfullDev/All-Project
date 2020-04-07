package com.gvl.entities;

import java.util.Date;

public interface ILyricist {
	int getLyricistId();

	void setLyricistId(int lyricistId);

	String getLyricistName();

	void setLyricistName(String lyricistName);

	Date getDob();

	void setDob(Date dob);

	String getGender();

	void setGender(String gender);

	int getSongsWrote();

	void setSongsWrote(int songsWrote);

	String getHighestAward();

	void setHighestAward(String highestAward);
}