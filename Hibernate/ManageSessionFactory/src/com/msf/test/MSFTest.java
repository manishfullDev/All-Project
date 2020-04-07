package com.msf.test;

import com.msf.accessor.VehicleAccessor;
import com.msf.entities.Vehicle;
import com.msf.helper.SessionFactoryRegistry;

public class MSFTest {
	public static void main(String[] args) {
		VehicleAccessor vehicleAccessor = null;
		Vehicle vehicle = null;

		try {
			vehicleAccessor = new VehicleAccessor();
			vehicle = vehicleAccessor.getVehicle(1);
			System.out.println(vehicle);
		} finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
