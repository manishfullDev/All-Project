package com.bs3.entities;

import java.io.Serializable;

public class Album implements Serializable {
	protected int id;
	protected String title;
	protected String genere;
	protected String composer;
	protected int duration;
	protected int tracks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTracks() {
		return tracks;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", genere=" + genere + ", composer=" + composer + ", duration="
				+ duration + ", tracks=" + tracks + "]";
	}

}
