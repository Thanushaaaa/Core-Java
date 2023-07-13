package com.xworkz.Hospital;

public class Robot {
	static String purpose;
	int weight;
	void cook()
	{
		System.out.println("Instance");
		System.out.println(purpose);
		System.out.println(this.weight);
		walk();
	}
	static void walk()
	{
		System.out.println("Static");
		purpose="Cooking";
		System.out.println(purpose);
	}

}
