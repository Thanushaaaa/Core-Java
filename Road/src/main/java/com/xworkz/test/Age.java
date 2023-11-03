package com.xworkz.test;

public class Age {
	
	static void check(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid age");
		}
		else
		{
			System.out.println("Vote");
		}
	}

}
