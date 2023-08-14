package com.xworkz.India;

public interface PoliticianRepository {
	int COUNT=5;
	void save(String name);
	default void display()
	{
		
	}
	default String findStartswith(String name)
	{
		return name;
		
	}

}
