package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.Elevator;
import com.xworkz.blanket.implementation.PristineElevator;
import com.xworkz.blanket.user.JacksonElevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		
		Elevator elevator=new PristineElevator();
		elevator.carryLuggage();
		
		JacksonElevator jack=new JacksonElevator(elevator);
		jack.move();

	}

}
