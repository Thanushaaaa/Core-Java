package com.xworkz.Gift;

public class Rakshith {

	Laptop laptop;

	public Rakshith(Laptop laptop) {
		this.laptop = laptop;
		System.out.println("Running parameterized const in Rakshith");
	}

	public void code() {
		if (laptop != null) {
			System.out.println("You can work");
			this.laptop.watch();
		} else {
			System.err.println("You can't work");
		}
	}

}
