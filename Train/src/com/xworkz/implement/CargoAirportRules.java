package com.xworkz.implement;

import com.xworkz.app.AirportRules;

public class CargoAirportRules implements AirportRules {
	public int ticketPrice = 8342;

	@Override
	public void fly() {
		System.out.println("fly in air");

	}

}
