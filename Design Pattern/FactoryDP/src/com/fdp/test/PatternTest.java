package com.fdp.test;

import com.fdp.beans.Pizza;
import com.fdp.store.HyderabadPizzaStore;

public class PatternTest {
	public static void main(String[] args) {
		Pizza pizza = null;
		HyderabadPizzaStore hyderabadPizzaStore = null;
		
		hyderabadPizzaStore = new HyderabadPizzaStore();
		pizza = hyderabadPizzaStore.order("veg");
		System.out.println("hc : "+ pizza.hashCode());
	}
}
