package com.bs5.entities;

import java.io.Serializable;

public class Track implements Serializable {
	protected int trackNo;
	protected String title;
	protected int duration;
	protected String singerName;
	protected String composer;
	protected String genere;

	public int getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Track [trackNo=" + trackNo + ", title=" + title + ", duration=" + duration + ", singerName="
				+ singerName + ", composer=" + composer + ", genere=" + genere + "]";
	}

}
