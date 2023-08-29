package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.Laptop;
import com.xworkz.blanket.implementation.LenovoLaptop;
import com.xworkz.blanket.user.SonuSoodLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop laptop=new LenovoLaptop();
		laptop.display();
		
		SonuSoodLaptop sonu=new SonuSoodLaptop(laptop);
		sonu.buyLaptop();

	}

}
