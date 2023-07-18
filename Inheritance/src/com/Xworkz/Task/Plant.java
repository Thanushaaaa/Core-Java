package com.Xworkz.Task;

public class Plant extends LivingThing{
	
	Plant()
	{
		System.out.println("no arg const in plant");
	}
	Plant(String type,int age,String color)
	{
		super(type,age,color);
		System.out.println("Running parameterized const in plant");
		this.type=type;
		this.age=age;
		this.color=color;
	}

}
