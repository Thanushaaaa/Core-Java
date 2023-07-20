package com.Xworkz.Task;

public class FamilyCourt extends CivilCourt {
	FamilyCourt()
	{
		System.out.println("no arg const in FamilyCourt");
	}
	void divorce()
	{
		System.out.println("running divorce in FamilyCourt");
	}
	@Override
	void propertyCase()
	{
		System.out.println("running propertyCase in FamilyCourt");
	}
	@Override
	void theftCase()
	{
		System.out.println("running theftCase in FamilyCourt");
	}

}
