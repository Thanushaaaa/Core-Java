package com.Xworkz.Task;

public class IceCreamRunner {

	public static void main(String[] args) {
		Food food2=new IceCream();
		food2.cook();
		Food food=new IceCream(true,200,1);
		System.out.println(food.sweet);
		System.out.println(food.price);
		System.out.println(food.quantity);
		Food food1=new Food(false,150,2);
		System.out.println(food1.sweet);
		System.out.println(food1.price);
		System.out.println(food1.quantity);
		// TODO Auto-generated method stub

	}

}
