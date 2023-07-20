package com.Xworkz.Task;

public class CivilCourt extends HighCourt {
	CivilCourt()
	{
		System.out.println("no arg const in CivilCourt");
	}
	void propertyCase()
	{
		System.out.println("running propertyCase in CivilCourt");
	}
	void theftCase()
	{
		System.out.println("running theftCase in CivilCourt");
	}
	@Override
	void criminalCase()
	{
		System.out.println("running criminalCase in CivilCourt");
	}
	@Override
	void forgeryCase()
	{
		System.out.println("running forgeryCase in CivilCourt");
	}
}
