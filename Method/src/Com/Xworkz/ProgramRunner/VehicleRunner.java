package Com.Xworkz.ProgramRunner;

import Com.Xworkz.Program.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Running main");
		Vehicle vehicle = new Vehicle(6788999, "ktm", "black", 300, "Arjun");
		System.out.println(vehicle);
		Vehicle vehicle2 = new Vehicle(200988, "Royal Enfield", "Red", 400, "Arun");
		System.out.println(vehicle2);
		boolean compare = vehicle.equals(vehicle2);
		System.out.println(" Are vehicless same " + compare);

	}

}
