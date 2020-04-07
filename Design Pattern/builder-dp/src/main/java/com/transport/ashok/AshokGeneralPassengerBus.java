package com.transport.ashok;

import com.transport.api.Bus;

public class AshokGeneralPassengerBus extends Bus {

	@Override
	public void drive() {
		System.out.println("driving bus with registrationNo : " + rtaRegistrationNo + " with manual gears");
	}

	final static public class AshokBusBuilder extends BusBuilder {

		public AshokBusBuilder(int busNo, String manufacturer, String model, String rtaRegistrationNo) {
			super(busNo, manufacturer, model, rtaRegistrationNo);
		}

		@Override
		public Bus build() {
			AshokGeneralPassengerBus bus = null;

			bus = new AshokGeneralPassengerBus();
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
