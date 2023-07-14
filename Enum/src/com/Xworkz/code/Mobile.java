package com.Xworkz.code;

public class Mobile {
	MobileBrand brand;
	String color;
	int price;
	int weight=130;
	Mobile(String color)
	{
		this.color=color;
	}
	void communicate(MobileBrand brand)
	{
		this.brand=brand;
	}
	void display()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(weight);
		
	}

}
