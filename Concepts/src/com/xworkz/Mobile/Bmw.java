package com.xworkz.Mobile;

public class Bmw extends Car {
	String owner;

	public Bmw(String type, int price, String owner, String brand) {
		super(type, price, brand);
		this.owner = owner;
		System.out.println("Running parameterized constructor in Bmw");
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println(owner);
		System.out.println("Invoking method in Bmw");

	}

}
