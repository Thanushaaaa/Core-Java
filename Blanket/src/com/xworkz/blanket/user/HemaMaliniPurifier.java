package com.xworkz.blanket.user;

import com.xworkz.blanket.app.WaterPurifier;

public class HemaMaliniPurifier {
	
	private WaterPurifier purifier;
	
	public HemaMaliniPurifier(WaterPurifier purifier)
	{
		this.purifier=purifier;
		System.out.println("Running WaterPurifier const of HemaMaliniPurifier");
	}
	public void Waterfilter()
	{
		if(purifier!=null)
		{
			System.out.println("Filter is working..");
			this.purifier.filter();
		}
		else
		{
			System.out.println("Filter is not working");
		}
	}
	

}
