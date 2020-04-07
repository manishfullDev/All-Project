package com.jbv.bean;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import com.jbv.constraint.annotations.MatchAny;
import com.jbv.groups.Group1;
import com.jbv.groups.Group2;

public class Journey {
	@Positive(message = "{journey.journeyNo.blank}", groups = { Group1.class })
	protected int journeyNo;
	@NotBlank(message = "source cannot be blank", groups = { Group1.class })
	@MatchAny(values = { "Hyderabad", "Chennai", "Banglore" }, groups = { Group1.class })
	protected String source;
	@NotBlank(message = "destination cannot be blank", groups = { Group1.class })
	protected String destination;
	@Future(message = "journeyDate should be future date", groups = { Group1.class })
	protected Date journeyDate;

	@Min(value = 100, message = "price should be greater than or equal to 100", groups = { Group2.class })
	@Max(value = 9999, message = "price should be less than or equal to 9999", groups = { Group2.class })
	protected double price;
	@NotBlank(message = "busNo cannot be blank", groups = { Group2.class })
	@Length(min = 10, max = 13, message = "busNo should be 8 characters", groups = { Group2.class })
	protected String busNo;
	@Positive(message = "travelHours should be positive integer", groups = { Group2.class })
	protected int travelHours;

	public int getJourneyNo() {
		return journeyNo;
	}

	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}

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

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public int getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(int travelHours) {
		this.travelHours = travelHours;
	}

}
