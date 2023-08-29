package com.xworkz.blanket.user;

import com.xworkz.blanket.app.SmartWatch;

public class KlRahul {
	
	private SmartWatch watch;
	
	public KlRahul(SmartWatch watch)
	{
		this.watch=watch;
		System.out.println("Running SmartWatch const of KlRahul");
	}
	public void wearSmartWatch()
	{
		if(this.watch!=null)
		{
			System.out.println("Watch is working,can buy");
			this.watch.showTime();
		}
		else {
			System.err.println("Watch is not working,can not buy");
		}
	}

}
