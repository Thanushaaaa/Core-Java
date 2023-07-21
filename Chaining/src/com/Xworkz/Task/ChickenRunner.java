package com.Xworkz.Task;

public class ChickenRunner {

	public static void main(String[] args) {
		FarmChicken farmChicken=new FarmChicken(500,"btm",56,"Anirudh");
		farmChicken.printInfo();
		
		BroilerChicken broilerChicken=new BroilerChicken(600,"rajajinagar",true,5);
		broilerChicken.printInfo();
		
		Chicken chicken=new Chicken(700,"Hebbal");
		chicken.printInfo();
    
	}

}
