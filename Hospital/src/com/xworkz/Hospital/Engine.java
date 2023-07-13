package com.xworkz.Hospital;

public class Engine {
	static String type;
	int length;
	void move()
	{
		System.out.println("Instance");
		System.out.println(this.length);
		System.out.println(type);
		work();
	}
	static void work()
	{
		System.out.println("Static");
		type="Electric";
		System.out.println(type);
	}

}
