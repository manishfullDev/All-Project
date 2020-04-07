package com.bp.dto;

import java.util.Date;

public class JourneyDto {
	protected int journeyId;
	protected String source;
	protected String destination;
	protected Date travelDate;
	protected String busProviderName;
	protected int busProviderId;
	protected double price;

	public JourneyDto(int journeyId, String source, String destination, Date travelDate, String busProviderName,
			double price) {
		super();
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.busProviderName = busProviderName;
		this.price = price;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
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

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getBusProviderName() {
		return busProviderName;
	}

	public void setBusProviderName(String busProviderName) {
		this.busProviderName = busProviderName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

}
