package com.fdp.beans;

public class VegPizza implements Pizza {
	@Override
	public void make() {
		System.out.println("veg pizza");
	}
}
