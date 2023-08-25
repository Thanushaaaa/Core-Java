package com.xworkz.HierarchicalInheritance;

public class Pizza extends Food {
	int slices;

	public Pizza(String type, int price, int slices) {
		super(type, price);
		this.slices = slices;
		System.out.println("Running parameterized const in Pizza");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(slices);
	}

}
