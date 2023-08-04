package com.xworkz.implement;

import com.xworkz.app.MetroRules;

public class AgraMetroRules implements MetroRules {
	public String name = "Bansankari metro";

	@Override
	public void swipe() {
		System.out.println("Swipe the metro card");

	}
}
