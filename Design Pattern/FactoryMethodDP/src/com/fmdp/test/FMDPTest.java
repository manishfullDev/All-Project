package com.fmdp.test;

import com.fmdp.beans.Car;
import com.fmdp.pattern.MaruthiFactory;
import com.fmdp.pattern.MaruthiNoidaFactory;
import com.fmdp.pattern.MaruthiPuneFactory;

public class FMDPTest {
	public static void main(String[] args) {
		MaruthiFactory mnf = new MaruthiNoidaFactory();
		Car car = mnf.newCar("alto");
		car.drive();
		
		MaruthiFactory mpf = new MaruthiPuneFactory();
		Car car1 = mpf.newCar("swift");
		car1.drive();
	}

}
