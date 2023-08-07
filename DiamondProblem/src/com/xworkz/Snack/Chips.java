package com.xworkz.Snack;

public interface Chips {
	void crispy();

	default void buy() {
		System.out.println("Buy chips");
	}

}
