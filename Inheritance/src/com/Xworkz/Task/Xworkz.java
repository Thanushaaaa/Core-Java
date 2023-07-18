package com.Xworkz.Task;

public class Xworkz extends Institute {
	Xworkz()
	{
		System.out.println("no arg const in Xworkz");
	}
	Xworkz(String name,String location,int cost)
	{
		super(name,location,cost);
		System.out.println("Running parameterized const in Xwork");
		this.name=name;
		this.location=location;
		this.cost=cost;
	}
}


