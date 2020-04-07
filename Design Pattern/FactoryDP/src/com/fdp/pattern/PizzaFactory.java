package com.fdp.pattern;

import com.fdp.beans.ChickenPizza;
import com.fdp.beans.Pizza;
import com.fdp.beans.VegCornPizza;
import com.fdp.beans.VegPizza;

public class PizzaFactory {
	public static Pizza createPizza(String pizzaType) {
		Pizza pizza = null;

		if (pizzaType.equals("veg")) {
			pizza = new VegPizza();
		} else if (pizzaType.equals("chicken")) {
			pizza = new ChickenPizza();
		} else if (pizzaType.equals("vegcorn")) {
			pizza = new VegCornPizza();
		}
		pizza.make();
		return pizza;
	}

}
