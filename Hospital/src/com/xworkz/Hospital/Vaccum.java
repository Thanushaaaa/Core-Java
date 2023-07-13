package com.xworkz.Hospital;

public class Vaccum {
	static int price;
	String color;
	void clean()
	{
		System.out.println("Instance");
		System.out.println(price);
		System.out.println(this.color);
		move();
		
	}
	static void move()
	{
		System.out.println("Static");
		price=1000;
		System.out.println(price);
	}
	

}
