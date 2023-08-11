package com.xworkz.injection;

public interface HospitalRepository {
	int NO_OF_NAMES=5;
	void save(String name);
	default void display()
	{
		
	}

}
