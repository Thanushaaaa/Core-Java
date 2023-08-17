package com.xworkz.ring.shop.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String name;
	private int age;
	private double height;
	private double weight;
	private int bill;

	public CustomerDTO() {

	}

	public CustomerDTO(String name, int age, double height, double weight, int bill) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bill = bill;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public int getBill() {
		return bill;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", bill="
				+ bill + "]";
	}

}
