package com.Xworkz.Task;

public class Franchise {
	String name;
	String location;
	long price;
	int auctionYear;
	Franchise()
	{
		System.out.println("franchise");
	}
	Franchise(String name,String location,long price,int auctionYear)
	{
		this.name=name;
		this.location=location;
		this.price=price;
		this.auctionYear=auctionYear;
	}
	void play()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(price);
		System.out.println(auctionYear);
	}
	

}
