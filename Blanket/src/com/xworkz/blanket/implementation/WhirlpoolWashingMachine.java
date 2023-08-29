package com.xworkz.blanket.implementation;

import com.xworkz.blanket.app.WashingMachine;

public class WhirlpoolWashingMachine implements WashingMachine{

	@Override
	public boolean wash() {
		System.out.println("Running wash method in WhirlpoolWashingMachine");
		return true;
	}
	
	

}
