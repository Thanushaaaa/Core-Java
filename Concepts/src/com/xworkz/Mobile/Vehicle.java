package com.xworkz.Mobile;

public class Vehicle {
	String type;
	int price;

	public Vehicle() {
		System.out.println("no args const in vehicle");
	}

	public Vehicle(String type, int price) {
		this.type = type;
		this.price = price;
		System.out.println("Running parameterized constructor in vehicle");
	}

	public void drive() {
		System.out.println("Invoking method in vehicle");
		System.out.println(type);
		System.out.println(price);
	}

}
