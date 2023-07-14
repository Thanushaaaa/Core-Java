package com.Xworkz.code;

public class Battery {
	String brand;
	String use;
	BatteryPrice cost;
	int weight=500;
	Battery(String use)
	{
		System.out.println("Instance");
		this.use=use;
	}
	void store(BatteryPrice cost)
	{
		this.cost=cost;
		
	}
	void display()
	{
		System.out.println(brand);
		System.out.println(use);
		System.out.println(cost);
		System.out.println(weight);
		
	}

}
