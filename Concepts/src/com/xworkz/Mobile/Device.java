package com.xworkz.Mobile;

public class Device {
	String type;
	int price;

	public Device(String type, int price) {

		this.type = type;
		this.price = price;
		System.out.println("Running parameterized constructor in Device");
	}

	public void display() {
		System.out.println("Invoking method in device");
		System.out.println(type);
		System.out.println(price);
	}
}
