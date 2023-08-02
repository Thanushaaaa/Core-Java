package com.xworkz.Car.Abstract;

public abstract class Bmw extends Mercedes {
	public void sell() {
		System.out.println("Selling price");
	}

	public abstract void color();

	public final void buy() {
		System.out.println("buy in Bmw");
	}

}
