package com.afdp.benz.beans;

import com.afdb.api.factory.VehicleFactory;
import com.afdp.api.beans.Bus;
import com.afdp.api.beans.Truck;

public class BenzVehicleFactoryImpl extends VehicleFactory {

	@Override
	protected Bus createBus(String model) {
		Bus bus = null;

		if (model.equals("volvo sleeper")) {
			bus = new VolvoSleeperBusImpl();
		} else if (model.equals("volvo super suspension sleeper")) {
			bus = new VolvoSuperSuspensionSleeperBusImpl();
		}

		return bus;
	}

	@Override
	protected Truck createTruck(String model) {
		Truck truck = null;

		if (model.equals("heavy truck")) {
			truck = new HeavyTruckImpl();
		} else if (model.equals("20 wheels")) {
			truck = new Truck20WheelImpl();
		}
		return truck;
	}

}
