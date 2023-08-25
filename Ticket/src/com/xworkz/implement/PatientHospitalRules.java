package com.xworkz.implement;

import com.xworkz.app.HospitalRules;

public class PatientHospitalRules implements HospitalRules {
	public String doctorName = "Sanjay";

	@Override
	public void treat() {
		System.out.println("Treatment in hospital");

	}

}
