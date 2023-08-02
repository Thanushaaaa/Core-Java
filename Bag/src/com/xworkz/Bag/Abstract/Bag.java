package com.xworkz.Bag.Abstract;

public abstract class Bag {
	public abstract void capacity();

	public final void shop() {
		System.out.println("Shop in bag");
	}

	public void carry() {
		System.out.println("Carry in bag");
	}

}
