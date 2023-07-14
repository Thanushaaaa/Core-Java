package com.Xworkz.code;

public class Theater {
	String name="Darshan Theater";
	TheaterSeatType seatType;
	int price;
	String location;
	Theater(int price)
	{
		System.out.println("Instance");
		this.price=price;
	}
	
	void watch(TheaterSeatType seatType)
	{
		this.seatType=seatType;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(seatType);
		System.out.println(price);
		System.out.println(location);
	}
}