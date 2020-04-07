package com.fdp.store;

import com.fdp.beans.Pizza;
import com.fdp.pattern.PizzaFactory;

public class ChennaiPizzaStore {
	public Pizza order(String pizzaType) {
		Pizza pizza = null;

		pizza = PizzaFactory.createPizza(pizzaType);
		System.out.println("packaging..");
		
		return pizza;
	}
}
