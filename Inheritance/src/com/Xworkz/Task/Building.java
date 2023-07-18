package com.Xworkz.Task;

public class Building {
	String name;
	double height;
	long cost;
	Building()
	{
		System.out.println("no arg const in Building");
	}
	Building(String name,double height,long cost)
	{
		System.out.println("Running parameterized const in Building");
		this.name=name;
		this.height=height;
		this.cost=cost;
		
	}
	void stay()
	{
		System.out.println("stay");
	}

}
