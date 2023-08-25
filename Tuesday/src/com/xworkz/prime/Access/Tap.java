package com.xworkz.prime.Access;

public class Tap {
	private String brand;
	private String color;
	private int price;
	private String use;

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public String getUse() {
		return use;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Brand is " + brand + " color is " + color + " price is " + price + " use is " + use);
	}

}
