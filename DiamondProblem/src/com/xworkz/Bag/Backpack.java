package com.xworkz.Bag;

public interface Backpack extends TravelBag {
	@Override
	void carry();

	default void store() {
		System.out.println("store items");
	}

}
