package com.Xworkz.code;

public class BatteryRunner {
	public static void main(String[] args)
	{
		Battery battery=new Battery("Power");
		battery.cost=BatteryPrice.five_hundred;
		battery.brand="Exide";
		battery.display();
		Battery battery1=new Battery("Light");
		battery.cost=BatteryPrice.two_hundred;
		battery.brand="Genius";
		battery.display();
		
	}

}
