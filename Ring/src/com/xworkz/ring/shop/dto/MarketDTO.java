package com.xworkz.ring.shop.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String location;
	private int no_of_vendors;
	private String type;
	private String owner;
	private int discount;

	public MarketDTO(String location, int no_of_vendors, String type, String owner, int discount) {

		this.location = location;
		this.no_of_vendors = no_of_vendors;
		this.type = type;
		this.owner = owner;
		this.discount = discount;
	}

	public MarketDTO() {

	}

	public String getLocation() {
		return location;
	}

	public int getNo_of_vendors() {
		return no_of_vendors;
	}

	public String getType() {
		return type;
	}

	public String getOwner() {
		return owner;
	}

	public int getDiscount() {
		return discount;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNo_of_vendors(int no_of_vendors) {
		this.no_of_vendors = no_of_vendors;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "[location=" + location + ", no_of_vendors=" + no_of_vendors + ", type=" + type + ", owner=" + owner
				+ ", discount=" + discount + "]";
	}

}
