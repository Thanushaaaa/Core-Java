package com.xworkz.Gift;

public class Virat {

	private SmartWatch smartWatch;

	public Virat(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("Running parameterized const in Virat");
	}

	public void work() {
		if (smartWatch != null) {
			System.out.println("Measure");
			this.smartWatch.measure();
		} else {
			System.err.println("doesn't work");
		}

	}

}
