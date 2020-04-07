package com.qba.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BusProviderWithJourneyBo implements Serializable {
	protected BusProviderBo busProvider;
	protected List<JourneyBo> journeys;

	public BusProviderWithJourneyBo(BusProviderBo busProvider) {
		this.busProvider = busProvider;
		this.journeys = new ArrayList<JourneyBo>();
	}

	public BusProviderBo getBusProvider() {
		return busProvider;
	}

	public void setBusProvider(BusProviderBo busProvider) {
		this.busProvider = busProvider;
	}

	public List<JourneyBo> getJourneys() {
		return journeys;
	}

	public void setJourneys(List<JourneyBo> journeys) {
		this.journeys = journeys;
	}

	@Override
	public String toString() {
		return "BusProviderWithJourneyBo [busProvider=" + busProvider + ", journeys=" + journeys + "]";
	}

}
