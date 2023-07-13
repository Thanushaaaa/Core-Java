package com.xworkz.Hospital;

public class Submarine {
	static String use;
	int price;
	void war()
	{
		System.out.println("Instance");
		System.out.println(use);
		System.out.println(this.price);
		travel();
	}
	static void travel()
	{
		System.out.println("Static");
		use="defend";
		System.out.println(use);
	}

}
