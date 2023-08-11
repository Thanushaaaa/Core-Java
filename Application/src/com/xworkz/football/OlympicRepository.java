package com.xworkz.football;

public interface OlympicRepository {
	int COUNT=5;
	void save(int year);
	default void display() {
		
	}

}
