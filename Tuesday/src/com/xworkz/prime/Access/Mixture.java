package com.xworkz.prime.Access;

public class Mixture {
	private int price;
	private double quantity;
	private String color;
	private double rating;
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public double getQuantity() {
		return quantity;
	}
	public double getRating() {
		return rating;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("color is "+color+" price is "+price+" quantity is "+quantity+" rating is "+rating);
	}

}
