package com.di.beans;

import java.util.UUID;

public class DeliveryAdvisor {
	public String getNextReadyToDeliveryPackage() {
		return UUID.randomUUID().toString();
	}
}
