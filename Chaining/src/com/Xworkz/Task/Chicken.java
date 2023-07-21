package com.Xworkz.Task;

public class Chicken {
	int price;
	String location;
	Chicken(int price,String location)
	{
		this.price=price;
		this.location=location;
		System.out.println("Running no arg const in chicken");
	}
	void printInfo()
	{
		System.out.println("running print info method in chicken");
		System.out.println(this.price);
		System.out.println(this.location);

	}
	

}
