package com.xworkz.Practice;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*"); //Adding space beside star changes the pattern
			}
			System.out.println();
		} 
		
		

	}

}
