package com.xworkz.Hospital;

public class NumberPlate {
	static String state;
	int length;
	void identify()
	{
		System.out.println("Instance");
		System.out.println(state);
		System.out.println(this.length);
		register();
		
	}
	static void register()
	{
		System.out.println("Static");
		state="Karnataka";
		System.out.println(state);
	}
}

