package com.Xworkz.Task;

public class Bengaluru extends City {
	
	Bengaluru()
	{
		System.out.println("no arg constructor in Bnglr");
	}
	Bengaluru(String state,long area,long population)
	{
		super(state,area,population);
		System.out.println("Running parameterized constructor in Bengaluru");
		this.state=state;
		this.area=area;
		this.population=population;
	}
	

}
