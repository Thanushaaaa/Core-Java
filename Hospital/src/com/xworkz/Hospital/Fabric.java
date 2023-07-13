package com.xworkz.Hospital;

public class Fabric {
	static String use;
	int length;
	void stitch()
	{
		System.out.println("Instance");
		System.out.println(use);
		System.out.println(this.length);
		buy();
	}
	static void buy()
	{
		System.out.println("Static");
		use="Fashion";
		System.out.println(use);
		
	}

}
