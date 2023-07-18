package com.Xworkz.Task;

public class IceCream extends Food {
	IceCream()
	{
		System.out.println("no arg const in IceCream");
	}
	IceCream(boolean sweet,int price,int quantity)
	{
	    super(sweet,price,quantity);
		System.out.println("Running parameterized const in IceCream");
		this.sweet=sweet;
		this.price=price;
		this.quantity=quantity;

}
}
