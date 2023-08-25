package com.xworkz.prime.Access;

public class Calculator {
	private int price;
	private String color;
	private String brand;
	private double length;
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public double getLength() {
		return length;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		
		return(" price is "+price+" color is "+color+" brand is "+brand+" length is "+length); 
	}

}
