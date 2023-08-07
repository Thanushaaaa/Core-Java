package com.xworkz.Drink;

public class CoolDrinkRunner {

	public static void main(String[] args) {
		BTMCoolDrink cd=new BTMCoolDrink();
		cd.energy();
		cd.stamina();
		cd.cool();
		
		PepsiCoolDrink pcd=new BTMCoolDrink();
		pcd.cool();
		pcd.energy();
		
		CokeCoolDrink ccd=new BTMCoolDrink();
		ccd.cool();
		ccd.stamina();
		

	}

}
