package com.flc.entities;

import java.io.Serializable;

public class Lyric implements Serializable {
	protected int lyricId;
	protected String songTitle;
	protected String writeUp;
	protected String genere;
	protected String language;
	protected String writtenBy;

	public int getLyricId() {
		return lyricId;
	}

	public void setLyricId(int lyricId) {
		this.lyricId = lyricId;
	}

	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getWriteUp() {
		return writeUp;
	}

	public void setWriteUp(String writeUp) {
		this.writeUp = writeUp;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(String writtenBy) {
		this.writtenBy = writtenBy;
	}

	@Override
	public String toString() {
		return "Lyric [lyricId=" + lyricId + ", songTitle=" + songTitle + ", writeUp=" + writeUp + ", genere=" + genere
				+ ", language=" + language + ", writtenBy=" + writtenBy + "]";
	}

}
