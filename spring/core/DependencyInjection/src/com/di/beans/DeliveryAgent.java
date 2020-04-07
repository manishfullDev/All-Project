package com.di.beans;

public class DeliveryAgent {
	private DeliveryAdvisor deliveryAdvisor;

	public DeliveryAgent(DeliveryAdvisor deliveryAdvisor) {
		this.deliveryAdvisor = deliveryAdvisor;
	}

	public void scheduleDelivery() {
		String packageToDelivery = null;
		packageToDelivery = deliveryAdvisor.getNextReadyToDeliveryPackage();
		System.out.println("schedule for delivery : " + packageToDelivery);
	}

}
