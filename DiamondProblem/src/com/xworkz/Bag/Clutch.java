package com.xworkz.Bag;

public interface Clutch extends TravelBag {
	@Override
	void carry();

	default void safety() {
		System.out.println("safety for items");
	}

}
