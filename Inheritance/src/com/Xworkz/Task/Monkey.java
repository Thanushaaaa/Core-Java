package com.Xworkz.Task;

public class Monkey extends Animal{
	
	Monkey()
	{
		System.out.println("no arg const in Monkey");
	}
	Monkey(String name,int weight,int height)
	{
	    super(name,weight,height);
		System.out.println("Running parameterized const in Monkey");
		this.name=name;
		this.weight=weight;
		this.height=height;
	}

}
