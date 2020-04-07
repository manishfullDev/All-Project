package com.jbmvc.dto;

public class BusProviderDto {
	protected int busProviderId;
	protected String busProviderName;

	public BusProviderDto(int busProviderId, String busProviderName) {
		this.busProviderId = busProviderId;
		this.busProviderName = busProviderName;
	}

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

	public String getBusProviderName() {
		return busProviderName;
	}

	public void setBusProviderName(String busProviderName) {
		this.busProviderName = busProviderName;
	}

}
