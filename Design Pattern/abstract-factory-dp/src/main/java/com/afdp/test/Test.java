package com.afdp.test;

import com.afdb.api.factory.VehicleFactory;
import com.afdp.api.beans.Bus;

public class Test {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = VehicleFactory.newInstance();
		Bus bus = vehicleFactory.newBus("volvo sleeper");
		bus.accelarate(100);
	}

}
