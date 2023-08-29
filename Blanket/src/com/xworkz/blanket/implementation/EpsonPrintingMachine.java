package com.xworkz.blanket.implementation;

import com.xworkz.blanket.app.PrintingMachine;

public class EpsonPrintingMachine implements PrintingMachine{

	@Override
	public boolean print() {
		if(NO_OF_ZEROX<=100)
		{
			System.out.println("Printer is working,can print..");
			return true;
		}
		else {
			System.err.println("Printer is not working,cannot print..");
			return false;
		}
	}

}
