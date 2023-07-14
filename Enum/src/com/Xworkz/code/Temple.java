package com.Xworkz.code;

public class Temple {
	String name="Rama temple";
	String location;
	TempleTicketPrice ticketPrice;
	boolean prasada;
	Temple(String location)
	{
		System.out.println("Instance");
		this.location=location;
		
	}
	void pray(TempleTicketPrice ticketPrice)
	{
		this.ticketPrice=ticketPrice;
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(ticketPrice);
		System.out.println(prasada);
		
	}

}
