package com.xworkz.Bags;

public interface Backpack extends TravelBag {
	@Override
	void carry();
	default void store()
	{
		System.out.println("store items");
	}

}
