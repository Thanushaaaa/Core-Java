package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Slipper slipper = new Slipper("Puma", 5000, 10, "Seller", "Abhay", "Black", 5);
		System.out.println(slipper);
		Slipper slipper1 = new Slipper("Nike", 3000, 15, "Buyer", "Arun", "White", 6);
		System.out.println(slipper1);
		boolean compare = slipper.equals(slipper1);
		System.out.println("Are slippers same " + compare);

	}

}
