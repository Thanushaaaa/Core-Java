package com.xworkz.Hospital;

public class Hospital {
	static String name;
	String branch;
	String chiefDoctor;
	
	void displayInstance()
	{
		System.out.println("Instance");
		System.out.println(name);
		System.out.println(this.branch);
		System.out.println(this.chiefDoctor);
		displayStatic();
		
	}
	void displayStatic()
	{
		System.out.println("Static");
		name="Apollo";
		System.out.println(name);
	}
}
	
	
   

