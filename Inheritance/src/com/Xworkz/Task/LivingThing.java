package com.Xworkz.Task;

public class LivingThing {
	String type;
	int age;
	String color;
	LivingThing()
	{
		System.out.println("no arg const in LT");
	}
	LivingThing(String type,int age,String color){
		System.out.println("Running parameterized const in LT");
		this.type=type;
		this.age=age;
		this.color=color;
	}
	void live()
	{
		System.out.println("live");
	}
	

}
