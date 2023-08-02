package com.xworkz.Rocket.Run;

import com.xworkz.Rocket.Abstraction.Rocket;
import com.xworkz.Rocket.Abstraction.Pslv;
import com.xworkz.Rocket.Implementation.PslvImplementation;

public class Run {

	public static void main(String[] args) {
		Rocket rocket = new PslvImplementation();
		rocket.sendDate();
		rocket.landingDate();
		Pslv pslv = (Pslv) rocket;
		pslv.send();
		pslv.land();
		pslv.test();

	}

}
