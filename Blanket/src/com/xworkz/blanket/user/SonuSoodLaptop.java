package com.xworkz.blanket.user;

import com.xworkz.blanket.app.Laptop;

public class SonuSoodLaptop {
	
	private Laptop acer;
	
	public SonuSoodLaptop(Laptop acer)
	{
		this.acer=acer;
		System.out.println("Running Laptop const of SonuSoodLaptop");
	}
	public void buyLaptop() {
		if(acer!=null)
		{
			System.out.println("Laptop is working..");
			this.acer.display();
		}
		else
		{
			System.err.println("Laptop is not working..");
		}
	}

}
