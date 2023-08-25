package com.xworkz.HierarchicalInheritance;

public class Food {
	public String type;
	public int price;

	public Food(String type, int price) {
		this.type = type;
		this.price = price;
		System.out.println("Running parameterized const in food");

	}

	public void display() {
		System.out.println(type);
		System.out.println(price);
	}

}
