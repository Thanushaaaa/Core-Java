package com.xworkz.Rocket.Implementation;

import com.xworkz.Rocket.Abstraction.Pslv;

public class PslvImplementation extends Pslv {
	@Override
	public void land() {
		System.out.println("Land");
	}

	@Override
	public void sendDate() {
		System.out.println("send");
	}

}
