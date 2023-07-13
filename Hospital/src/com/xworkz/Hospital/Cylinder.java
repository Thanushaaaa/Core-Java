package com.xworkz.Hospital;

public class Cylinder {
	static String color;
	int weight;
	
	void cook()
	{
		System.out.println("Instance");
		System.out.println(this.weight);
		System.out.println(color);
		burn();
	}
	static void burn()
	{
		System.out.println("Static");
		color="Red";
		System.out.println(color);
	

	}
	

}
