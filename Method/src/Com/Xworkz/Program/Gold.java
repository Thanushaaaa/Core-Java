package Com.Xworkz.Program;

public class Gold {
	private String shopName;
	private String owner;
	private long price;
	private String location;

	public Gold(String shopName, String owner, long price, String location) {
		this.shopName = shopName;
		this.owner = owner;
		this.price = price;
		this.location = location;
		System.out.println("Running parameterized constructor");
	}

	public String getLocation() {
		return location;
	}

	public String getOwner() {
		return owner;
	}

	public long getPrice() {
		return price;
	}

	public String getShopName() {
		return shopName;
	}

	@Override
	public String toString() {

		return " Price is " + price + " Shop name is " + shopName + " Owner name is " + owner + " location is "
				+ location;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof Gold) {
				System.out.println(this);
				System.out.println(obj);
				Gold casted = (Gold) obj;
				if (this.price == casted.price && this.shopName == casted.shopName && this.location == casted.location
						&& this.owner == casted.owner) {
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
