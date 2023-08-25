package com.xworkz.MultiLevelInheritance;

public class Car extends Vehicle {
	String brand;

	public Car() {
		System.out.println("Constructor overloading");
	}

	public Car(String type, int price, String brand) {
		super(type, price);
		this.brand = brand;
		System.out.println("Running parameterized constructor in car");
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println(brand);
		System.out.println("Invoking method in car");

	}

}
