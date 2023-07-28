package Com.Xworkz.Program;

public class DryFruit {
	private String type;
	private int price;
	private String color;
	private String location;
	private String owner;
	private double rating;

	public DryFruit(String type, int price, String color, String location, String owner, double rating) {

		this.type = type;
		this.price = price;
		this.color = color;
		this.location = location;
		this.owner = owner;
		this.rating = rating;
		System.out.println("Running parameterized constructor");
	}

	public String getColor() {
		return color;
	}

	public String getLocation() {
		return location;
	}

	public String getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return " Color is " + color + " Location is " + location + " Owner is " + owner + " Price is " + price
				+ " Type is " + type + " Rating is " + rating;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof DryFruit) {
				System.out.println(this);
				System.out.println(obj);
				DryFruit casted = (DryFruit) obj;
				if (this.color == casted.color && this.owner == casted.owner && this.price == casted.price
						&& this.rating == casted.rating && this.type == casted.type) {
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