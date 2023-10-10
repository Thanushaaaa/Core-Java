package com.xworkz.array.mobile;

public class Array9 { //count programs

	public static void main(String[] args) {
		int[] array= {67,21,2,9,76};
		int count=0;
		for(int index=0;index<array.length;index++)
		{
			if(array[index]%2==0) {  //!==0 for count of odd numbers
				count=count+1;
			}
			
		}
		System.out.println(count);
		
		

	}

}
