package com.xworkz.SingleInheritance;

public class Doctor {
	String name;
	int age;

	public Doctor(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Running parameterized const in doctor");
	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
	}

}
