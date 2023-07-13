package com.xworkz.Hospital;

public class ContactLens {
	static String use;
	int price;
	void visibility()
	{
		System.out.println("Instance");
		System.out.println(use);
		System.out.println(this.price);
		help();
	}
	void help()
	{
		System.out.println("Static");
		use="vision";
		System.out.println(use);
	}

}
