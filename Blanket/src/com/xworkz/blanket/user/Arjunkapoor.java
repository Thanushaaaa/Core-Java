package com.xworkz.blanket.user;

import com.xworkz.blanket.app.WashingMachine;

public class Arjunkapoor {
	
	private WashingMachine machine;
	
	public Arjunkapoor(WashingMachine machine)
	{
		this.machine=machine;
		System.out.println("Running WashingMachine consts in Arjunkapoor");
	}
	public void dry()
	{
		if(machine!=null)
		{
			System.out.println("WashingMachine is Working");
			this.machine.wash();
		}
		else
		{
			System.err.println("WashingMachine is not working");
		}
	}

}
