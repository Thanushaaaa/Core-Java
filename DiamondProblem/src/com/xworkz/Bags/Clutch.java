package com.xworkz.Bags;

public interface Clutch extends TravelBag{
	@Override
	void carry();
	default void safety()
	{
		System.out.println("safety for items");
	}

}
