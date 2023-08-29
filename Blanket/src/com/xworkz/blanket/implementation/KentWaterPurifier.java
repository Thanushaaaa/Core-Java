package com.xworkz.blanket.implementation;

import com.xworkz.blanket.app.WaterPurifier;

public class KentWaterPurifier implements WaterPurifier{

	@Override
	public boolean filter() {
		System.out.println("Running filter method in KentWaterPurifier");
		return true;
	}
	
	

}
