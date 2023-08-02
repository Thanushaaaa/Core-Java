package com.xworkz.Mobile;

public class Tablet extends Laptop {
	String use;

	public Tablet(String type, int price, String color, String use) {
		super(type, price, color);
		this.use = use;
		System.out.println("Parameterized const in Tablet");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(use);
		System.out.println("Invoking method in tablet");
	}

}
