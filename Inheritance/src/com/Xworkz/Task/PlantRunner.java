package com.Xworkz.Task;

public class PlantRunner {

	public static void main(String[] args) {
		LivingThing livingThing2=new Plant();
		livingThing2.live();
		LivingThing livingThing=new Plant("Thulsi",5,"green");
		System.out.println(livingThing.type);
		System.out.println(livingThing.age);
		System.out.println(livingThing.color);
		
		// TODO Auto-generated method stub
		LivingThing livingThing1=new LivingThing("Neem",4,"green");
		System.out.println(livingThing1.type);
		System.out.println(livingThing1.age);
		System.out.println(livingThing1.color);

	}

}
