package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.WashingMachine;
import com.xworkz.blanket.implementation.WhirlpoolWashingMachine;
import com.xworkz.blanket.user.Arjunkapoor;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		WashingMachine machine=new WhirlpoolWashingMachine();
		machine.wash();
		
		Arjunkapoor kapoor=new Arjunkapoor(machine);
		kapoor.dry();

	}

}
