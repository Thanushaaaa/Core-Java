package com.xworkz.Mobile.Implementation;

import com.xworkz.Mobile.Abstract.Redmi;

public class MobileImplementation extends Redmi {
	@Override
	public void buy() {
		System.out.println("buy in implementation");
	}

	@Override
	public void network() {
		System.out.println("Network in implementation");
	}

}
