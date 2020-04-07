package com.ci.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TripPk implements Serializable {
	protected String source;
	protected String destination;
	@Column(name = "trip_day")
	protected int tripDay;
	@Column(name = "trip_month")
	protected int tripMonth;
	@Column(name = "trip_year")
	protected int tripYear;
	protected String organizer;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTripDay() {
		return tripDay;
	}

	public void setTripDay(int tripDay) {
		this.tripDay = tripDay;
	}

	public int getTripMonth() {
		return tripMonth;
	}

	public void setTripMonth(int tripMonth) {
		this.tripMonth = tripMonth;
	}

	public int getTripYear() {
		return tripYear;
	}

	public void setTripYear(int tripYear) {
		this.tripYear = tripYear;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	@Override
	public String toString() {
		return "TripPk [source=" + source + ", destination=" + destination + ", tripDay=" + tripDay + ", tripMonth="
				+ tripMonth + ", tripYear=" + tripYear + ", organizer=" + organizer + "]";
	}

}
