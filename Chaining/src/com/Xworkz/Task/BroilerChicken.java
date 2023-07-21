package com.Xworkz.Task;

public class BroilerChicken extends Chicken {
	
		boolean alive;
		int weight;
		BroilerChicken(int price,String location,boolean alive,int weight)
		{
			super(price,location);
			this.alive=alive;
			this.weight=weight;
		}
		@Override
		void printInfo()
		{
			System.out.println("running print info method in BroilerInfo");
			super.printInfo();
			System.out.println(this.alive);
			System.out.println(this.weight);

		}
		

	}


