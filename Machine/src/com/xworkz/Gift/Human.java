package com.xworkz.Gift;

public class Human {

	Kidney kidney;

	public Human(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Running parameterized const in Human");
	}

	public void walk() {
		if (kidney != null) {
			System.out.println("working");
			this.kidney.clean();
		} else {
			System.out.println("Kidney isn't working");
		}
	}

}
