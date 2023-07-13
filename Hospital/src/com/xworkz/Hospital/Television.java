package com.xworkz.Hospital;

public class Television {
	static String brand;
	int price;
	void entertainment()
	{
		System.out.println("Instance");
		System.out.println(brand);
		System.out.println(this.price);
		watch();
	}
	static void watch()
	{
		System.out.println("Static");
		brand="LG";
		System.out.println(brand);
	}

}
