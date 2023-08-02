package com.xworkz.Mobile.Runner;

import com.xworkz.Mobile.Implementation.MobileImplementation;
import com.xworkz.Mobile.Abstract.Mobile;
import com.xworkz.Mobile.Abstract.Redmi;

public class Run {

	public static void main(String[] args) {
		Mobile mobile = new MobileImplementation();
		mobile.network();
		mobile.talk();
		mobile.study();

		Redmi redmi = (Redmi) mobile;
		redmi.buy();
		redmi.sell();
		redmi.work();

	}

}
