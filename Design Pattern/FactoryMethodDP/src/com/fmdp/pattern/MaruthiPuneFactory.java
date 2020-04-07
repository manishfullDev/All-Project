package com.fmdp.pattern;

import com.fmdp.beans.Car;
import com.fmdp.beans.SwiftCar;

public class MaruthiPuneFactory extends MaruthiFactory {
	protected Car createCar(String model) {
		Car car = null;

		if (model.equals("swift")) {
			car = new SwiftCar();
		}

		return car;
	}
}
