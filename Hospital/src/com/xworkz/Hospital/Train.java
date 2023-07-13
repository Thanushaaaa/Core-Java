package com.xworkz.Hospital;

public class Train {
	static String type;
	String state;
	void travel()
	{
		System.out.println("Instance");
		System.out.println(type);
		System.out.println(this.state);
		reach();
		
	}
	static void reach()
	{
		System.out.println("static");
		type="Express";
		System.out.println(type);
	}

}
