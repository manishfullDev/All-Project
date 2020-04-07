package com.ci.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip implements Serializable {
	@EmbeddedId
	protected TripPk pk;
	protected String description;
	protected int days;
	protected float cost;

	public TripPk getPk() {
		return pk;
	}

	public void setPk(TripPk pk) {
		this.pk = pk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Trip [pk=" + pk + ", description=" + description + ", days=" + days + ", cost=" + cost + "]";
	}

}
