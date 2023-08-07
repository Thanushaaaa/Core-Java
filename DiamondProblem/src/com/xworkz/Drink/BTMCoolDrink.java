package com.xworkz.Drink;

public class BTMCoolDrink implements CokeCoolDrink,PepsiCoolDrink{

	@Override
	public void energy() {
		System.out.println("Cool drink gives you energy");
		
	}

	@Override
	public void cool() {
		System.out.println("Cool drink is cool");
		
		
	}

	@Override
	public void stamina() {
		System.out.println("Cool drink gives you stamina");
		
	}
	

}
