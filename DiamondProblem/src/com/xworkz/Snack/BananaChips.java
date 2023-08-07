package com.xworkz.Snack;

public interface BananaChips extends Chips {
	@Override
	void crispy();

	default void sell() {
		System.out.println("Sell chips");
	}

}
