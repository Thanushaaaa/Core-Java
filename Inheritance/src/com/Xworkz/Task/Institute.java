package com.Xworkz.Task;

public class Institute {
	String name;
	String location;
	int cost;
	Institute()
	{
		System.out.println("no arg const in Institute");
	}
	Institute(String name,String location,int cost)
	{
		System.out.println("Running parameterized const in Institute");
		this.name=name;
		this.location=location;
		this.cost=cost;
	}
	void learn()
	{
		System.out.println("learn");
	}

}
