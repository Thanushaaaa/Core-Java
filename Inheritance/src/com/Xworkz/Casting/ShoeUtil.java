package com.Xworkz.Task;

public class ShoeUtil {
	ShoeUtil(Shoe shoe)
	{
		System.out.println("Shoeutil");
		if(shoe!=null)
		{
			System.out.println(shoe.price);
			System.out.println(shoe.size);
			System.out.println(shoe.color);
			if(shoe instanceof PumaShoe)
			{
				PumaShoe pumashoe=(PumaShoe)shoe;
				pumashoe.printInfo();
			}
			if(shoe instanceof NikeShoe)
			{
				NikeShoe nikeShoe=(NikeShoe)shoe;
				nikeShoe.printInfo();
			
		}
	}
	

}
