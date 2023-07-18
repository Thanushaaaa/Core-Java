package com.Xworkz.Task;

public class OmkarRunner {

	public static void main(String[] args) {
		Architect architect2=new Omkar();
		architect2.work();
		Architect architect=new Omkar("Omkar",40,5000);
		System.out.println(architect.name);
		System.out.println(architect.age);
		System.out.println(architect.salary);
		// TODO Auto-generated method stub
		Architect architect1=new Architect("Omkar1",45,5200);
		System.out.println(architect1.name);
		System.out.println(architect1.age);
		System.out.println(architect1.salary);

	}

}
