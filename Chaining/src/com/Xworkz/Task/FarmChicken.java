package com.Xworkz.Task;

public class FarmChicken extends Chicken {
	int noOfDays;
	String careTaker;
	FarmChicken(int price,String location,int noOfDays,String careTaker)
	{
		super(price,location);
		this.noOfDays=noOfDays;
		this.careTaker=careTaker;
		
	}
	@Override
	void printInfo()
	{
		System.out.println("running print info method in FarmChicken");
		super.printInfo();
		System.out.println(this.noOfDays);
		System.out.println(this.careTaker);

	}

}
