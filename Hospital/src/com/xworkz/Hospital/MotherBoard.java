package com.xworkz.Hospital;

public class MotherBoard {
	static String type;
	int price;
	void connect()
	{
		System.out.println("Instance");
		System.out.println(type);
		System.out.println(this.price);
		distribute();
		
	}
	static void distribute()
	{
		System.out.println("Static");
		type="ATX";
		System.out.println(type);
	}

}
