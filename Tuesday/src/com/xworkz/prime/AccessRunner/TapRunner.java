package com.xworkz.prime.AccessRunner;

import com.xworkz.prime.Access.Tap;

public class TapRunner {

	public static void main(String[] args) {
		Tap tap = new Tap();
		System.out.println(tap);
		tap.setBrand("rolex");
		tap.setColor("white");
		tap.setPrice(500);
		tap.setUse("water");
		System.out.println(tap);

	}

}
