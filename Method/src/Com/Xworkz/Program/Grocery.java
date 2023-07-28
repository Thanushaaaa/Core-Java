package Com.Xworkz.Program;

public class Grocery {
	private int cost;
	private String location;

	public Grocery(int cost, String location) {
		this.cost = cost;
		this.location = location;
		System.out.println("Invoking parameterized constructor");
	}

	public int getCost() {
		return cost;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {

		return " Cost is " + this.cost + " Location is " + this.location;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof Grocery) {
				System.out.println(this);
				System.out.println(obj);
				Grocery casted = (Grocery) obj;
				if (this.cost == casted.cost && this.location == casted.location) {
					return true;
				} else {
					return false;
				}
			}

		} else {
			System.err.println("Invalid arguments,stop comparing");
		}
		return false;
	}
}
