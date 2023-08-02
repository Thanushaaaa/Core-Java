package com.xworkz.MobileRunner;

import com.xworkz.Mobile.Burger;
import com.xworkz.Mobile.Food;
import com.xworkz.Mobile.Pizza;

public class FoodRunner {

	public static void main(String[] args) {
		Food food = new Burger("veg", 500, "Orange");
		food.display();

		Food food1 = new Pizza("veg", 500, 6);
		food1.display();

	}

}
