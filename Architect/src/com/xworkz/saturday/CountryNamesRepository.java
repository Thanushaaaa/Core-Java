package com.xworkz.saturday;

public interface CountryNamesRepository {
	int NO_OF_COUNTRIES = 10;

	void save(String name);

	default void display() {

	}

	boolean isExists(String name);

	String findReturnUppercase(String name);

	String findReturnLowercase(String name);

	String[] findStartsWith(String name);

	void savedCount();

	String[] findEndsWith(String name);

	String[] findMatching(String name);

	String[] orderAsc();

	String[] orderDesc();

}
