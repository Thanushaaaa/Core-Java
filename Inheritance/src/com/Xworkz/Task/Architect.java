package com.Xworkz.Task;

public class Architect {
	String name;
	int age;
	int salary;
	Architect()
	{
		System.out.println("no arg const in Architect");
	}
	Architect(String name,int age,int salary)
	{
		System.out.println("Running parameterized const in 	Architect");
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void work()
	{
		System.out.println("he works");
	}

}
