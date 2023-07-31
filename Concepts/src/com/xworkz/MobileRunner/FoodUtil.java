package com.xworkz.MobileRunner;

import com.xworkz.Mobile.Food;
import com.xworkz.Mobile.Pizza;
import com.xworkz.Mobile.Burger;

public class FoodUtil {
	FoodUtil(Food food) {
		if (food != null) {
			System.out.println(food.type);
			System.out.println(food.price);
			if (food instanceof Pizza) {
				Pizza pizza = (Pizza) food;
				System.out.println();
				pizza.display();
			}
			if (food instanceof Burger) {
				Burger burger = (Burger) food;
				System.out.println();
				burger.display();
			}

		}

	}

}
