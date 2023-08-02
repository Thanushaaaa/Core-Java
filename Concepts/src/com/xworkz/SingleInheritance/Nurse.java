package com.xworkz.Mobile;

public class Nurse extends Doctor {
	int salary;

	public Nurse(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
		System.out.println("Running parameterized const in Nurse");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(salary);
	}

}
