package com.Xworkz.Task;

public class Omkar extends Architect {
	Omkar(){
		System.out.println("no arg const in Omkar");
	}
	Omkar(String name,int age,int salary)
	{
		super(name,age,salary);
		System.out.println("Running parameterized const in Omkar");
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}

}
