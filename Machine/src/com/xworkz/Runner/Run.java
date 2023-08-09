package com.xworkz.Runner;

import com.xworkz.Gift.*;
import com.xworkz.Implementation.*;

public class Run {

	public static void main(String[] args) {

		EpsonPrintingMachine epsonPrintingMachine = new EpsonPrintingMachine();
		epsonPrintingMachine.print();

		Amithab amithab = new Amithab(epsonPrintingMachine);
		amithab.work();

		AppleWatch appleWatch = new AppleWatch();
		appleWatch.measure();

		Virat virat = new Virat(appleWatch);
		virat.work();

		LenovoLaptop lenovoLaptop = new LenovoLaptop();
		lenovoLaptop.watch();

		Rakshith rakshith = new Rakshith(lenovoLaptop);
		rakshith.code();

		PassengerElevator elevator = new PassengerElevator();
		elevator.carry();

		Aradhya aradhya = new Aradhya(elevator);
		aradhya.move();

		PureitWaterPurifier pureitWaterPurifier = new PureitWaterPurifier();
		pureitWaterPurifier.repair();

		Tendulkar tendulkar = new Tendulkar(pureitWaterPurifier);
		tendulkar.filter();

		WhirlpoolWashingMachine whirlpoolWashingMachine = new WhirlpoolWashingMachine();
		whirlpoolWashingMachine.clean();

		Ram ram = new Ram(whirlpoolWashingMachine);
		ram.wash();

		LeftSideKidney leftSideKidney = new LeftSideKidney();
		leftSideKidney.clean();

		Human human = new Human(leftSideKidney);
		human.walk();

	}

}
