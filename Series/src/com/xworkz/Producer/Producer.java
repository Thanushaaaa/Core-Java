package com.xworkz.Producer;

import java.io.Serializable;

public class Producer implements Serializable {

	String name;
	transient int age;
	static String movieName;
	
	private static final long serialversionUID=5432189L;

	public Producer(String name, int age,String movieName) {

		this.name = name;
		this.age = age;
		this.movieName=movieName;
	}

}
