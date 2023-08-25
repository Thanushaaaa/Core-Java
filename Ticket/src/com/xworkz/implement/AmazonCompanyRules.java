package com.xworkz.implement;

import com.xworkz.app.CompanyRules;

public class AmazonCompanyRules implements CompanyRules {
	public String location = "Mumbai";

	@Override
	public void work() {
		System.out.println("Work hard");

	}

}
