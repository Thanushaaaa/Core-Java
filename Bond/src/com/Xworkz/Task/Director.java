package com.Xworkz.Task;

public class Director {
	String name;
	int age;
	int height;
	int weight;
	Director()
	{
		System.out.println("director");
	}
	Director(String name,int age,int height,int weight)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	void direct()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
	}

}
