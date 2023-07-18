package com.Xworkz.Task;

public class City {
	String state;
	long area;
	long population;
	City()
	{
		System.out.println("no arg constructor");
	}
	City(String state,long area,long population)
	{
		System.out.println("Running parameterized const in City");
		this.state=state;
		this.area=area;
		this.population=population;
	}
	 void stay()
	 {
		 System.out.println("stay");
	 }

}
