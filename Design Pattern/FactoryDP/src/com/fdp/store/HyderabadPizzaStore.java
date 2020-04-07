package com.fdp.store;

import com.fdp.beans.Pizza;
import com.fdp.pattern.PizzaFactory;

public class HyderabadPizzaStore {
	public Pizza order(String pizzaType) {
		Pizza pizza = null;

		pizza = PizzaFactory.createPizza(pizzaType);
		System.out.println("boxing..");
		
		return pizza;
	}
}
