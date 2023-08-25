package com.xworkz.implement;

import com.xworkz.app.HostelRules;

public class StudentHostelRules implements HostelRules {
	public String studentName = "Ankith";

	@Override
	public void visit() {
		System.out.println("Visiting hours");
	}

}
