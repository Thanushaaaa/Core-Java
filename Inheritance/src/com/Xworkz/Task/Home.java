package com.Xworkz.Task;

public class Home extends Building{
	
	Home()
	{
		System.out.println("no arg constructor in home");
	}
	Home(String name,double height,long cost)
	{
	super(name,height,cost);
	System.out.println("Running parameterized constructor in Home");
	this.name=name;
	this.height=height;
	this.cost=cost;
	}

}
