package com.massenger.service;

public class MessageService {
	protected String providerId;
	protected String circle;
	protected String secret;
	protected String uniqueIdentificationCode;

	public boolean text(String mobileNo, String message) {
		System.out.println("MessageService [providerId=" + providerId + ", circle=" + circle + ", secret=" + secret
				+ ", uniqueIdentificationCode=" + uniqueIdentificationCode + "]");
		return true;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getUniqueIdentificationCode() {
		return uniqueIdentificationCode;
	}

	public void setUniqueIdentificationCode(String uniqueIdentificationCode) {
		this.uniqueIdentificationCode = uniqueIdentificationCode;
	}

}
