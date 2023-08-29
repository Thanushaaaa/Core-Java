package com.xworkz.blanket.user;

import com.xworkz.blanket.app.Elevator;

public class JacksonElevator {
	
	private Elevator starways;
	
	public JacksonElevator(Elevator starways)
	{
		this.starways=starways;
		System.out.println("Running Elevator const of JacksonElevator");
	}
	public void move()
	{
		if(starways!=null)
		{
			System.out.println("Elevator is moving");
			this.starways.carryLuggage();
		}
		else
		{
			System.err.println("Elevator is not moving");
		}
	}

}
