package com.xworkz.Hospital;

public class Indicator {
	static String type;
	int price;
	void measure()
	{
		System.out.println("Instance");
		System.out.println(type);
		System.out.println(this.price);
		analyse();
	}
	static void analyse()
	{
		System.out.println("Static");
		type="Chemical indicators";
		System.out.println(type);
	}

}
