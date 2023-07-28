package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Gold gold = new Gold("Lalitha", "Raj", 10006784, "Btm");
		System.out.println(gold);
		Gold gold2 = new Gold("Kalyan", "Ankith", 2000456, "Hebbal");
		System.out.println(gold2);
		boolean compare = gold.equals(gold2);
		System.out.println("Is gold same " + compare);

	}

}
