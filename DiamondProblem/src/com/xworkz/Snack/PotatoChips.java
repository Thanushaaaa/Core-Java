package com.xworkz.Snack;

public interface PotatoChips extends Chips{
	@Override
	void crispy();
	default void fry()
	{
		System.out.println("fry chips");
	}
	

}
