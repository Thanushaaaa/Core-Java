package com.xworkz.Gift;

public class Aradhya {

	Elevator elevator;

	public Aradhya(Elevator elevator) {
		this.elevator = elevator;
		System.out.println("Running parameterized const in aradhya");

	}

	public void move() {
		if (elevator != null) {
			System.out.println("Elevator working");
			this.elevator.carry();
		} else {
			System.out.println("Elevator doesn't work");
		}
	}

}
