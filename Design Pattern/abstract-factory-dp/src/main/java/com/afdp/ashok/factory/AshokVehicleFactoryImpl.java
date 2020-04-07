package com.afdp.ashok.factory;

import com.afdb.api.factory.VehicleFactory;
import com.afdp.api.beans.Bus;
import com.afdp.api.beans.Truck;
import com.afdp.ashok.beans.DeluxBusImpl;
import com.afdp.ashok.beans.GeneralPassengerBusImpl;
import com.afdp.ashok.beans.GeneralPurposeTruckImpl;
import com.afdp.ashok.beans.Truck10WheelImpl;

public class AshokVehicleFactoryImpl extends VehicleFactory {

	@Override
	protected Bus createBus(String model) {
		Bus bus = null;
		if (model.equals("general passenger")) {
			bus = new GeneralPassengerBusImpl();
		} else if (model.equals("delux bus")) {
			bus = new DeluxBusImpl();
		}

		return bus;
	}

	@Override
	protected Truck createTruck(String model) {
		Truck truck = null;

		if (model.equals("general purpose")) {
			truck = new GeneralPurposeTruckImpl();
		} else if (model.equals("10 wheels")) {
			truck = new Truck10WheelImpl();
		}
		return truck;
	}

}
