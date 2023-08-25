package com.xworkz.Gift;

public class Amithab {

	PrintingMachine printingMachine;

	public Amithab(PrintingMachine printingMachine) {
		this.printingMachine = printingMachine;
		System.out.println("Running parameterized constructor in Amithab");
	}

	public void work() {
		if (printingMachine != null) {
			System.out.println("Print");
			this.printingMachine.print();
		} else {
			System.err.println("Doesn't work");

		}
	}
}
