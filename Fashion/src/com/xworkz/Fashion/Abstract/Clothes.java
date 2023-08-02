package com.xworkz.Fashion.Abstract;

public abstract class Clothes extends Fashion {
	public abstract void design();

	public final void sell() {
		System.out.println("Sell in clothes");
	}

}
