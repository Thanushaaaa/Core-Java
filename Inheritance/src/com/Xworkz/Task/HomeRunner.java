package com.Xworkz.Task;

public class HomeRunner {

	public static void main(String[] args) {
		
		Building building2=new Home();
		building2.stay();
		Building building=new Home("Prasanthi nilayam",866.5,874375);
		System.out.println(building.name);
		System.out.println(building.height);
		System.out.println(building.cost);
		Building building1=new Building("Anand",756.6,426331);
		System.out.println(building1.name);
		System.out.println(building1.height);
		System.out.println(building1.cost);
		// TODO Auto-generated method stub

	}

}
