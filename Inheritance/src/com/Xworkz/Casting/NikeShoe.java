package com.Xworkz.Casting;

public class NikeShoe extends Shoe {
	String ceo;
	String brandAmbassidor;
	NikeShoe(String ceo,String brandAmbassidor,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		System.out.println("Running Nikeshoe");
		this.ceo=ceo;
		this.brandAmbassidor=brandAmbassidor;
	}
	void printInfo()
	{
		System.out.println("method Nikeshoe");
		System.out.println(this.ceo);
		System.out.println(this.brandAmbassidor);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.color);
	}
	

}
