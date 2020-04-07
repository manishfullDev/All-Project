package com.transport.benz;

import com.transport.api.Bus;

public class BenzVolvoBus extends Bus {

	@Override
	public void drive() {
		System.out.println("driving bus with reg no : " + rtaRegistrationNo + " capacity : " + capacity
				+ " with automatic gear transition");
	}

	public static final class BenzBusBuilder extends Bus.BusBuilder {

		public BenzBusBuilder(int busNo, String manufacturer, String model, String rtaRegistrationNo) {
			super(busNo, manufacturer, model, rtaRegistrationNo);
		}

		@Override
		public Bus build() {
			BenzVolvoBus bus = null;

			bus = new BenzVolvoBus();
			bus.setBusNo(busNo);
			bus.setModel(model);
			bus.setCapacity(capacity);
			bus.setChasisNo(chasisNo);
			bus.setColor(color);
			bus.setEngineNo(engineNo);
			bus.setFuelType(fuelType);
			bus.setManufacturer(manufacturer);
			bus.setRtaRegistrationNo(rtaRegistrationNo);

			return bus;
		}

	}
}
