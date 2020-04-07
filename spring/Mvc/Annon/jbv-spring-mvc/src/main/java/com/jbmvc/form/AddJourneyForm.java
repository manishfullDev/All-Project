package com.jbmvc.form;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class AddJourneyForm {
	@Positive
	protected int busProviderId;
	@NotBlank
	@Length(min = 5, max = 50)
	protected String source;
	@NotBlank
	@Length(min = 5, max = 50)
	protected String destination;
	@Future
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	protected Date journeyDate;
	@Positive
	protected double price;
	@NotBlank
	@Length(min = 10, max = 13)
	protected String busNo;

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
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

}
