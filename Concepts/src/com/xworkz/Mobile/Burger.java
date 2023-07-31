package com.xworkz.Mobile;

public class Burger extends Food {
	String color;

	public Burger(String type, int price, String color) {
		super(type, price);
		this.color = color;
		System.out.println("Running parameterized const in Burger");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(color);
	}

}
