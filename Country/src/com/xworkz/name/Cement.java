package com.xworkz.name;

public class Cement implements Cloneable {
	private String brandName;
	private String location;
	private int price;
	private String brandAmbassidor;
	private String ownerName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrandAmbassidor() {
		return brandAmbassidor;
	}

	public void setBrandAmbassidor(String brandAmbassidor) {
		this.brandAmbassidor = brandAmbassidor;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Brand name is " + brandName + " Location is " + location + " Price is " + price
				+ " Brand ambassidor is " + brandAmbassidor + " Owner name is " + ownerName;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Cement cement=(Cement)super.clone();
		return cement;
		
	}

}
