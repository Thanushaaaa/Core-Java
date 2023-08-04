package com.xworkz.implement;

import com.xworkz.app.PatentRules;

public class ProductPatentRules implements PatentRules {
	public String productName = "bulb";

	@Override
	public void apply() {
		System.out.println("Apply for patent rights");

	}

}
