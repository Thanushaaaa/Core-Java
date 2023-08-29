package com.xworkz.blanket.implementation;

import com.xworkz.blanket.app.Kidney;

public class RightSideKidney implements Kidney{

	@Override
	public boolean clean() 
	{
		System.out.println("Running clean method in  RightSideKidney");
		return true;
	}

}
