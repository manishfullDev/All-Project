package com.afdb.api.factory;

import com.afdp.api.beans.Bus;
import com.afdp.api.beans.Truck;
import com.afdp.ashok.factory.AshokVehicleFactoryImpl;
import com.afdp.benz.beans.BenzVehicleFactoryImpl;

abstract public class VehicleFactory {
	public static VehicleFactory newInstance() {
		VehicleFactory vehicleFactory = null;
		String defaultVendor = "benz";
		String vendor = null;

		vendor = System.getProperty("vendor");
		vendor = vendor == null ? defaultVendor : vendor;
		if (vendor.equals("benz")) {
			vehicleFactory = new BenzVehicleFactoryImpl();
		} else if (vendor.equals("ashok")) {
			vehicleFactory = new AshokVehicleFactoryImpl();
		}
		return vehicleFactory;
	}

	public Bus newBus(String model) {
		Bus bus = null;

		bus = createBus(model);
		return bus;
	}

	public Truck newTruck(String model) {
		Truck truck = null;

		truck = createTruck(model);
		return truck;
	}

	protected abstract Bus createBus(String model);

	protected abstract Truck createTruck(String model);
}
