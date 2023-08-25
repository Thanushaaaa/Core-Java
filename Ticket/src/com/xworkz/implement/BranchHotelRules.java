package com.xworkz.implement;

import com.xworkz.app.HotelRules;

public class BranchHotelRules implements HotelRules {
	public String branch = "Mumbai";

	@Override
	public void stay() {
		System.out.println("Stay in hotel");
	}

}
