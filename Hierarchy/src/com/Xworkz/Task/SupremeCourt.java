package com.Xworkz.Task;

public class SupremeCourt extends Court {
	SupremeCourt()
	{
		System.out.println("no arg const in SupremeCourt");
	}
	void importantCase()
	{
		System.out.println("running important case in SupremeCourt");
	}
	@Override
	void justice() {
   	 System.out.println("Running justice in SupremeCourt");
		
	}
	

}
