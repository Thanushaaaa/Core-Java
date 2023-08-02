package com.xworkz.Mobile;

public class Laptop extends Device {
	String color;

	public Laptop(String type, int price, String color) {
		super(type, price);
		this.color = color;
		System.out.println("Parameterized const in Laptop");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(color);
		System.out.println("Invoking method in laptop");
	}

}
