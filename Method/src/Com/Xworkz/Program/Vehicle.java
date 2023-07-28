package Com.Xworkz.Program;

public class Vehicle {
	private long price;
	private String company;
	private String color;
	private int mileage;
	private String owner;

	public Vehicle(long price, String company, String color, int mileage, String owner) {
		super();
		this.price = price;
		this.company = company;
		this.color = color;
		this.mileage = mileage;
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}

	public int getMileage() {
		return mileage;
	}

	public String getOwner() {
		return owner;
	}

	public long getPrice() {
		return price;
	}

	@Override
	public String toString() {

		return " Color is " + color + " Company is " + company + " Mileage is " + mileage + " Owner is " + owner
				+ " Price is " + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof Vehicle) {
				System.out.println(this);
				System.out.println(obj);
				Vehicle casted = (Vehicle) obj;
				if (this.color == casted.color && this.company == casted.company && this.mileage == casted.mileage
						&& this.price == casted.price) {
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
