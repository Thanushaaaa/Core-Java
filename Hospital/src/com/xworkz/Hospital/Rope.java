package com.xworkz.Hospital;

public class Rope {
	static int length;
	int price;
	void carry() {
		System.out.println("instance");
		System.out.println(length);
		System.out.println(this.price);
		pull();
	}
	static void pull()
	{
		System.out.println("Static");
		length=300;
		System.out.println(length);
	}

}
