package com.xworkz.Hospital;

public class NailCutter {
	static String color;
	int price;
	void cut()
	{
		System.out.println("Instance");
		System.out.println(color);
		System.out.println(this.price);
		sharp();
		
	}
	static void sharp()
	{
		System.out.println("Static");
		color="blue";
		System.out.println(color);
	}

}
