package Com.Xworkz.Program;

public class Assets {
	private int price;
	private String type;
	private String location;

	public Assets(int price, String type, String location) {
		this.price = price;
		this.type = type;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return " Price is " + price + " Type is " + type + " Location is " + location;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof Assets) {
				System.out.println(this);
				System.out.println(obj);
				Assets casted = (Assets) obj;
				if (this.price == casted.price && this.type == casted.type && this.location == casted.location) {
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
