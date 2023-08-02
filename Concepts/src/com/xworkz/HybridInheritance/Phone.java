package com.xworkz.Mobile;

public class Phone extends Device {
	String brand;

	public Phone(String type, int price, String brand) {
		super(type, price);
		this.brand = brand;
		System.out.println("Parameterized const in device");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(brand);
		System.out.println("invoking method in phone");
	}

}
