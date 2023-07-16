package com.Xworkz.Task;

public class Owner {
	String name;
	int age;
	int height;
	int weight;
	Owner()
	{
		System.out.println("Owner");
	}
	Owner(String name,int age,int height,int weight)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	void work()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
	}

}
