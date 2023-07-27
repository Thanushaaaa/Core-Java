package com.xworkz.prime.AccessRunner;
import com.xworkz.prime.Access.Helmet;
public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet=new Helmet();
		System.out.println(helmet);
		helmet.setBrand("Bajaj");
		helmet.setColor("Black");
		helmet.setPrice(1000);
		helmet.setUse("Safety");
		System.out.println(helmet);
	}

}
