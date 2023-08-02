package com.xworkz.Rocket.Abstraction;

public abstract class Pslv extends Rocket {

	public void send() {
		System.out.println("send rocket");
	}

	public abstract void land();

	public final void test() {
		System.out.println("Test in Pslv");
	}

}
