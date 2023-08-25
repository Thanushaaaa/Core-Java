package com.xworkz.implement;

import com.xworkz.app.BankRules;

public class SbiBankRules implements BankRules {
	public String location = "Banglore";

	@Override
	public void loan() {
		System.out.println("Loan interest");

	}

}
