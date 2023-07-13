package com.xworkz.Hospital;

public class Wire {
	static String type;
	int price;
	void distribute()
	{
		System.out.println("Instance");
		System.out.println(type);
		System.out.println(this.price);
		light();
		}
	static void light()
	{
		System.out.println("Static");
		type="Coaxial cable";
		System.out.println(type);
	}

}
