package com.fmdp.pattern;

import com.fmdp.beans.Car;

abstract public class MaruthiFactory {
	public Car newCar(String model) {
		Car car = null;

		car = createCar(model);
		System.out.println("#assemble()");
		System.out.println("#paint()");
		System.out.println("#qualityCheck()");

		return car;
	}

	protected abstract Car createCar(String model);
}
