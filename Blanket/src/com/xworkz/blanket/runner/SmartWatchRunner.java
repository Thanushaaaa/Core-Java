package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.SmartWatch;
import com.xworkz.blanket.implementation.OnePlusSmartWatch;
import com.xworkz.blanket.user.KlRahul;

public class SmartWatchRunner {

	public static void main(String[] args) {
		
		SmartWatch watch=new OnePlusSmartWatch();
		watch.showTime();
		
		KlRahul smart=new KlRahul(watch);
		smart.wearSmartWatch();

	}

}
