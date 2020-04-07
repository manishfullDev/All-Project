package com.jpagen.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "ratings")
public class Ratings implements Serializable {
	@Id
	@Column(name = "rating_sequence_no")
	@GeneratedValue(generator = "hilo_gen")
	@GenericGenerator(name = "hilo_gen", strategy = "hilo", parameters = { @Parameter(name = "max_lo", value = "5"),
			@Parameter(name = "table", value = "rating_unique_key"),
			@Parameter(name = "column", value = "rating_next_hi") })
	protected int ratingSequenceNo;
	@Column(name = "album_nm")
	protected String albumName;
	protected String reviewer;
	protected int rating;
	protected String comments;

	public int getRatingSequenceNo() {
		return ratingSequenceNo;
	}

	public void setRatingSequenceNo(int ratingSequenceNo) {
		this.ratingSequenceNo = ratingSequenceNo;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Ratings [ratingSequenceNo=" + ratingSequenceNo + ", albumName=" + albumName + ", reviewer=" + reviewer
				+ ", rating=" + rating + ", comments=" + comments + "]";
	}

}
