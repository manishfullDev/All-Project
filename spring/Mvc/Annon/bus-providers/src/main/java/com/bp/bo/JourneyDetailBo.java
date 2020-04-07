package com.bp.bo;

import java.util.Date;

public class JourneyDetailBo {
	protected int journeyId;
	protected String source;
	protected String destination;
	protected Date journeyDate;
	protected int travelTime;
	protected double cost;
	protected String busNo;
	protected BusProviderBo busProvider;

	public JourneyDetailBo(int journeyId, String source, String destination, Date journeyDate, int travelTime,
			double cost, String busNo, BusProviderBo busProvider) {
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.travelTime = travelTime;
		this.cost = cost;
		this.busNo = busNo;
		this.busProvider = busProvider;
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

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public BusProviderBo getBusProvider() {
		return busProvider;
	}

	public void setBusProvider(BusProviderBo busProvider) {
		this.busProvider = busProvider;
	}

}
