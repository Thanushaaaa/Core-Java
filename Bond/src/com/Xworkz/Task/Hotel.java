package com.Xworkz.Task;

public class Hotel {
	String name;
	int price;
	String location;
	boolean breakfast;
	Owner owner=new Owner("Ravan",40,5,50);
	Hotel()
	{
		System.out.println("hotel");
	}
	Hotel(String name,int price,String location,boolean breakfast)
	{
		this.name=name;
		this.price=price;
		this.location=location;
		this.breakfast=breakfast;
	}
	void hotelInfo()
	{
		System.out.println("The hotel name is :" +name);
		System.out.println("The hotel's location is " +location);
		System.out.println("Is breakfast available :" +breakfast);
		System.out.println("The hotel romm price is :" +price);
		this.owner.work();
	}

}
