package com.xworkz.Hospital;

public class Printer {
	static String brand;
	int weight;
	void print()
	{
		System.out.println("Instance");
		System.out.println(brand);
		System.out.println(this.weight);
		copy();
	}
	static void copy()
	{
		System.out.println("static");
		brand="Samsung";
		System.out.println(brand);
	}

}
