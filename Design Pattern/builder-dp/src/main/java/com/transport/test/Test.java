package com.transport.test;

import com.transport.api.Bus;

public class Test {
	public static void main(String[] args) {
		Bus bus = Bus.newBusBuilder("benz", 1, "benz", "volvo bus", "TS 09 ab 3039").capacity(30).color("red")
				.engineNo("e03934").fuelType("diesel").chasisNo("ach-3930").build();
		bus.drive();
	}
}
