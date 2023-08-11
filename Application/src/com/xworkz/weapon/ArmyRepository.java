package com.xworkz.weapon;

public interface ArmyRepository {
	int COUNT=5;
	void save(String name);
	default void display()
	{
		
	}

}
