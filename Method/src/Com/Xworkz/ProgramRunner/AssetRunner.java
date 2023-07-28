package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.Assets;

public class AssetRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Assets assets = new Assets(1000, "car", "Btm");
		System.out.println(assets);
		Assets assets2 = new Assets(2000, "House", "Hebbal");
		System.out.println(assets2);
		boolean compare = assets.equals(assets2);
		System.out.println(" Are assets same " + compare);

	}

}
