package com.Xworkz.Task;

public class Food {
	boolean sweet;
	int price;
	int quantity;
	Food()
	{
		System.out.println("no arg const in Food");
	}
	Food(boolean sweet,int price,int quantity)
	{
		System.out.println("Running parameterized const in Food");
		this.sweet=sweet;
		this.price=price;
		this.quantity=quantity;
	}
	void cook()
	{
		System.out.println("cook");
	}

}
