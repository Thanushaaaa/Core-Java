package com.xworkz.HierarchicalInheritance;

public class FoodRunner {

	public static void main(String[] args) {
		Food food = new Burger("veg", 500, "Orange");
		food.display();

		Food food1 = new Pizza("veg", 500, 6);
		food1.display();

	}

}
