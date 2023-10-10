package com.xworkz.array.mobile;

public class Array6 { //printing only two digit numbers in the array
	public static void main(String[] args) {
		int[] array= {90,3,32,2,80};
		
		for(int index=0;index<array.length;index++)
		{
			if(array[index]>9&&array[index]<100)
			{
				System.out.println(array[index]);
			}
		}
			

	}

}
