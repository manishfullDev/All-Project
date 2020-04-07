package com.fmdp.beans;

public class WagnorCar implements Car {
	@Override
	public void drive() {
		System.out.println(this.getClass().getName() + "drive");
	}

	@Override
	public void honk() {
		System.out.println(this.getClass().getName() + "honk()");
	}
}
