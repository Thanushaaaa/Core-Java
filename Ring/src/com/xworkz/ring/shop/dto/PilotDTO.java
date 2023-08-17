package com.xworkz.ring.shop.dto;

import java.io.Serializable;

public class PilotDTO implements Serializable {
	private String name;
	private int age;
	private double height;
	private double weight;
	private String partnerName;

	public PilotDTO() {

	}

	public PilotDTO(String name, int age, double height, double weight, String partnerName) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.partnerName = partnerName;
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

	public String getPartnerName() {
		return partnerName;
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

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	@Override
	public String toString() {
		return "PilotDTO [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", partnerName=" + partnerName + "]";
	}

}
