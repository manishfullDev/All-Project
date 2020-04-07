package com.bp.dto;

public class BusProviderDto {
	protected int busProviderId;
	protected String busProviderName;

	public BusProviderDto(int busProviderId, String busProviderName) {
		super();
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
