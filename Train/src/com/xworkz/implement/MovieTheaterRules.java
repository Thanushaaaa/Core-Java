package com.xworkz.implement;

import com.xworkz.app.TheaterRules;

public class MovieTheaterRules implements TheaterRules {
	public int price = 900;

	@Override
	public void watch() {
		System.out.println("Watch a movie");

	}

}
