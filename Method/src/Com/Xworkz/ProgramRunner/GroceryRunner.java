package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Grocery grocery = new Grocery(100, "Btm");
		System.out.println(grocery);
		Grocery grocery2 = new Grocery(200, "Hebbal");
		System.out.println(grocery2);
		boolean compare = grocery.equals(grocery2);
		System.out.println(" Are groceries same " + compare);

	}

}
