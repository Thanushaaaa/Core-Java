package com.xworkz.Gift;

public class Ram {

	private WashingMachine washingMachine;

	public Ram(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
		System.out.println("Running parameterized const in Ram");
	}

	public void wash() {
		if (washingMachine != null) {
			System.out.println("Wash clothes");
			this.washingMachine.clean();

		} else {
			System.out.println("doesn't work");

		}

	}

}
