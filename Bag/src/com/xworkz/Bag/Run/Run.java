package com.xworkz.Bag.Run;

import com.xworkz.Bag.Abstract.Bag;
import com.xworkz.Bag.Abstract.Gucci;
import com.xworkz.Bag.Implementation.BagImplementation;

public class Run {
	public static void main(String[] args) {
		Bag bag = new BagImplementation();
		bag.shop();
		bag.carry();
		Gucci gucci = (Gucci) bag;
		gucci.design();
		gucci.capacity();
		gucci.store();

	}
}
