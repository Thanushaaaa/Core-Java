package com.Xworkz.Task;

public class XworkzRunner {

	public static void main(String[] args) {
		Institute institute2=new Xworkz();
		institute2.learn();
		Institute institute=new Xworkz("Xworkz2","btm",24000);
		System.out.println(institute.name);
		System.out.println(institute.location);
		System.out.println(institute.cost);
		
		Institute institute1=new Institute("Xworkz3","rajajinagar",26000);
		System.out.println(institute1.name);
		System.out.println(institute1.location);
		System.out.println(institute1.cost);


		// TODO Auto-generated method stub

	}

}
