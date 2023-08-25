package com.xworkz.implement;

import com.xworkz.app.TempleRules;

public class GodTempleRules implements TempleRules {
	public int ticketPrice = 9009;

	@Override
	public void pray() {
		System.out.println("Pray in temples");
	}

}
