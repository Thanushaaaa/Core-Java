package com.Xworkz.Task;

public class MonkeyRunner {

	public static void main(String[] args) {
		
		Animal animal2=new Monkey();
		animal2.eat();
		Animal animal=new Monkey("monkey1",36,4);
		System.out.println(animal.name);
		System.out.println(animal.height);
		System.out.println(animal.weight);
		// TODO Auto-generated method stub
		Animal animal1=new Animal("monkey2",23,5);
		System.out.println(animal1.name);
		System.out.println(animal1.height);
		System.out.println(animal1.weight);
	}

}
