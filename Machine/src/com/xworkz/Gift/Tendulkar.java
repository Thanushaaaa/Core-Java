package com.xworkz.Gift;

public class Tendulkar {

	private WaterPurifier waterPurifier;

	public Tendulkar(WaterPurifier waterPurifier) {
		this.waterPurifier = waterPurifier;
		System.out.println("Running parameterized const in Tendulkar");
	}

	public void filter() {
		if (waterPurifier != null) {
			System.out.println("It works");
			this.waterPurifier.repair();

		} else {
			System.out.println("It doesn't work");

		}
	}

}
