package com.xworkz.Hospital;

public class simCard {
	static String company;
	String country;
	void call()
	{
		System.out.println("Instance");
		System.out.println(company);
		System.out.println(this.country);
		connect();
	}
	static void connect()
	{
		System.out.println("static");
		company="jio";
		System.out.println(company);
	}

}
