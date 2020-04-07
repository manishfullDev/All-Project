package com.fmdp.pattern;

import com.fmdp.beans.AltoCar;
import com.fmdp.beans.Car;
import com.fmdp.beans.WagnorCar;

public class MaruthiNoidaFactory extends MaruthiFactory {
	protected Car createCar(String model) {
		Car car = null;

		if (model.equals("alto")) {
			car = new AltoCar();
		} else if (model.equals("wagnor")) {
			car = new WagnorCar();
		}

		return car;
	}
}
