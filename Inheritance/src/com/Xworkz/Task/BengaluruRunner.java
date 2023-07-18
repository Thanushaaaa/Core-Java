package com.Xworkz.Task;

public class BengaluruRunner {

	public static void main(String[] args)
	{
		City city2=new Bengaluru();
		city2.stay();
		City city=new Bengaluru("Delhi",874394983,2387378);
		System.out.println(city.state);
		System.out.println(city.area);
		System.out.println(city.population);
		
		City city1=new City("Karnataka",1224234,77573747);
		System.out.println(city1.state);
		System.out.println(city1.area);
		System.out.println(city1.population);
		
		
		// TODO Auto-generated method stub

	}

}
