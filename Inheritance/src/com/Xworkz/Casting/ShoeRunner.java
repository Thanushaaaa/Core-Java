package com.Xworkz.Task;

public class ShoeRunner {

	public static void main(String[] args) {
		PumaShoe pumaShoe=new PumaShoe("Suede","Herzogenaurach",10000,ShoeSize.SEVEN,ShoeColor.BLACK);
		pumaShoe.printInfo();
		
		NikeShoe nikeShoe=new NikeShoe("Phil Knight","Deepika Padukone",20000,ShoeSize.SIX,ShoeColor.WHITE);
		nikeShoe.printInfo();
		
		// TODO Auto-generated method stub

	}

}
