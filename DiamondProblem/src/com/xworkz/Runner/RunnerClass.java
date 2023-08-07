package com.xworkz.Runner;
import com.xworkz.Snack.*;
import com.xworkz.Tools.*;
import com.xworkz.Bags.*;
public class RunnerClass {

	public static void main(String[] args) {
		Chips chips=new FrenchFries();
		chips.crispy();
		chips.buy();
		
		BananaChips bananaChips=new FrenchFries();
		bananaChips.crispy();
		bananaChips.sell();
		bananaChips.buy();
		
		PotatoChips potatoChips=new FrenchFries();
		potatoChips.crispy();
		potatoChips.fry();
		potatoChips.buy();
		
		FrenchFries frenchFries=new FrenchFries();
		frenchFries.crispy();
		frenchFries.buy();
		frenchFries.fry();
		frenchFries.sell();
		
		Hammer hammer=new Machine();
		hammer.work();
		hammer.help();
		
		Axe axe=new Machine();
		axe.work();
		axe.help();
		axe.sharp();
		
		Saw saw=new Machine();
		saw.work();
		saw.help();
		saw.function();
		
		Machine machine=new Machine();
		machine.work();
		machine.function();
		machine.help();
		machine.sharp();
		
		TravelBag travelBag=new HandBag();
		travelBag.carry();
		travelBag.use();
		
		Backpack backpack=new HandBag();
		backpack.carry();
		backpack.store();
		backpack.use();
		
		Clutch clutch=new HandBag();
		clutch.carry();
		clutch.safety();
		clutch.use();
		
		HandBag handBag=new HandBag();
		handBag.carry();
		handBag.use();
		handBag.store();
		handBag.safety();
		
		
		
		
		

	}

}
