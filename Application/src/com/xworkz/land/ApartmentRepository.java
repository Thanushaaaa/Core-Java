package com.xworkz.land;

public interface ApartmentRepository {
	int CAPACITY=5;
	void save(String name);
	
	default void display() {
		
	}

}

