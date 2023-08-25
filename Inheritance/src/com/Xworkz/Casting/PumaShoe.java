package com.Xworkz.Casting;

public class PumaShoe extends Shoe {
	String model;
	String origin;
	PumaShoe(String model,String origin,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		System.out.println("Running Pumashoe");
		this.model=model;
		this.origin=origin;
	}
	void printInfo()
	{
		System.out.println("method pumashoe");
		System.out.println(this.model);
		System.out.println(this.origin);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.color);
	}
	

}
