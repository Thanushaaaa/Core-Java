package com.xworkz.prime.Access;

public class HeadSet {
	private String brand;
	private int price;
	private String color;
	private double rating;
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public double getRating() {
		return rating;
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
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		
		return("Brand is "+brand+" color is "+color+" Price is "+price+" rating is "+rating);
	}

}
