package com.xworkz.prime.AccessRunner;
import com.xworkz.prime.Access.Satellite;
public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite=new Satellite();
		System.out.println(satellite);
		satellite.setName("Chandrayaan3");
		satellite.setDestination("moon");
		satellite.setUse("Communication");
		satellite.setWeight(553543);
		System.out.println(satellite);


	}

}
