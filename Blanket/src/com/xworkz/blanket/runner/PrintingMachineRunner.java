package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.PrintingMachine;
import com.xworkz.blanket.implementation.EpsonPrintingMachine;
import com.xworkz.blanket.user.RashmikaPrintingMachine;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		
		
		PrintingMachine machine=new EpsonPrintingMachine();
		machine.print();
		
		RashmikaPrintingMachine printer=new RashmikaPrintingMachine(machine);
		printer.zeroxFile();

	}

}
