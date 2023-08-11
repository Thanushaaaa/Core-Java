package com.xworkz.weapon;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyRepository armyRepository=new ArmyRepositoryImpl();
		armyRepository.save("Akshara");
		armyRepository.save("Neha");
		armyRepository.save("Harini");
		armyRepository.save("Nisha");
		armyRepository.save("Shalini");
		armyRepository.display();

	}

}
