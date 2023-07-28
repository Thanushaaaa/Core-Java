package Com.Xworkz.Program;

public class Slipper {
	private String brand;
	private int price;
	private double discount;
	private String shopName;
	private String owner;
	private String color;
	private double size;

	public Slipper(String brand, int price, double discount, String shopName, String owner, String color, double size) {
		super();
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.shopName = shopName;
		this.owner = owner;
		this.color = color;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getDiscount() {
		return discount;
	}

	public String getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}

	public String getShopName() {
		return shopName;
	}

	public double getSize() {
		return size;
	}

	@Override
	public String toString() {

		return " Brand is " + brand + " Color is " + color + " Discount is " + discount + " Owner is " + owner
				+ " Price is " + price + " Shop name is " + shopName + " Size is " + size;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Valid arguments,continue");
			if (obj instanceof Slipper) {
				System.out.println(this);
				System.out.println(obj);
				Slipper casted = (Slipper) obj;
				if (this.color == casted.color && this.owner == casted.owner && this.price == casted.price
						&& this.brand == casted.brand && this.discount == casted.discount
						&& this.shopName == casted.shopName && this.discount == casted.discount) {
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