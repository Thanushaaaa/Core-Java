package com.xworkz.Hospital;

public class Coastal {
	static String name;
	int area;
	void fishing()
	{
		System.out.println("Instance");
		System.out.println(name);
		System.out.println(this.area);
		produce();
		
	}
	static void produce()
	{
		System.out.println("static");
		name="Goa";
		System.out.println(name);
	}

}
