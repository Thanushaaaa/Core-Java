package com.xworkz.Bag;

public interface TravelBag {
	void carry();

	default void use() {
		System.out.println("carry things");
	}

}
