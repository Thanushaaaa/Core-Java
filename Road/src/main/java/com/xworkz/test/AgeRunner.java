package com.xworkz.test;

public class AgeRunner {

	public static void main(String[] args) {
		
		try {
			Age.check(19);
		} 
		
		catch (InvalidAgeException e) {
			System.out.println("Invalid age exception");
		}

	}

}
