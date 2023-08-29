package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.Kidney;
import com.xworkz.blanket.implementation.RightSideKidney;
import com.xworkz.blanket.user.HumanKidney;

public class KidneyRunner {

	public static void main(String[] args) {
		
		Kidney kidney=new RightSideKidney();
		kidney.clean();
		
		HumanKidney human=new HumanKidney(kidney);
		human.filter();
	}

}
