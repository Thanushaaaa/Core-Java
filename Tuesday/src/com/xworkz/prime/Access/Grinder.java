package com.xworkz.prime.Access;

public class Grinder {
	private String brand;
	private int price;
	private String color;
	private String speed;

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getSpeed() {
		return speed;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {

		return (" Brand is " + brand + " color is " + color + " price is " + price + "speed is " + speed);
	}

}
