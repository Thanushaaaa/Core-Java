package com.xworkz.prime.Access;

public class Helmet {
	private String brand;
	private int price;
	private String color;
	private String use;

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
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

		return ("Brand is " + brand + " color is " + color + " price is " + price + "use is " + use);
	}

}
