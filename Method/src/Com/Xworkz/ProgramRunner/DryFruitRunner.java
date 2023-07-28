package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		DryFruit dryFruit = new DryFruit("Badam", 500, "Brown", "Btm", "Abhay", 5);
		System.out.println(dryFruit);
		DryFruit dryFruit1 = new DryFruit("Pista", 700, "White", "Jayanagar", "Kiran", 4.5);
		System.out.println(dryFruit1);
		boolean compare = dryFruit.equals(dryFruit1);
		System.out.println("Are dry fruits same " + compare);

	}

}
