package com.xworkz.ring.shop.dto;

import java.io.Serializable;

public class TheaterDTO implements Serializable {
	private String name;
	private int ticketPrice;
	private String location;
	private int capacity;
	private String ownerName;

	public TheaterDTO(String name, int ticketPrice, String location, int capacity, String ownerName) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.location = location;
		this.capacity = capacity;
		this.ownerName = ownerName;
	}

	public TheaterDTO() {

	}

	public String getName() {
		return name;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public String getLocation() {
		return location;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override

	public String toString() {
		return " Theater name is " + name + " Ticket price is " + ticketPrice + " Location is " + location
				+ " Capacity is " + capacity + " Owner name is " + ownerName;

	}

}
