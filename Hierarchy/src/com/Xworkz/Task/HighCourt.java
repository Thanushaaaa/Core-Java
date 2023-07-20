package com.Xworkz.Task;

public class HighCourt extends SupremeCourt {
	HighCourt()
	{
		System.out.println("no arg const in HighCourt");
	}
	void criminalCase()
	{
		System.out.println("running criminalCase in HighCourt");
	}
	void forgeryCase()
	{
		System.out.println("running forgeryCase in HighCourt");
	}
	@Override
	void importantCase()
	{
		System.out.println("running importantCase in HighCourt");
	}



}
