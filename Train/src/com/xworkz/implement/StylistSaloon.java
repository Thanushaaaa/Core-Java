package com.xworkz.implement;

import com.xworkz.app.Saloon;

public class StylistSaloon implements Saloon {
	public String name = "Ankith";

	@Override
	public void pay() {
		System.out.println("pay money");
	}

}
