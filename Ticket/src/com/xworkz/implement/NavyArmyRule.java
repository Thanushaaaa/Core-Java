package com.xworkz.implement;

import com.xworkz.app.ArmyRule;

public class NavyArmyRule implements ArmyRule {
	public String dressColor = "Blue";

	@Override
	public void protect() {
		System.out.println("Protecting country");
	}

}
