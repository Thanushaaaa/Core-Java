package com.Xworkz.Task;

public class Animal {
	String name;
	int weight;
	int height;
	Animal()
	{
		System.out.println("no arg const in Animal");
	}
	Animal(String name,int weight,int height)
	{
		System.out.println("Running parameterized const in Animal");
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	void eat()
	{
		System.out.println("eat");
	}
}
