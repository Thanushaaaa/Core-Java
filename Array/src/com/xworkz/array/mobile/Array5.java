package com.xworkz.array.mobile;

public class Array5 { //printing elements in even index

	public static void main(String[] args) {
		int[] array= {23,12,90,54,32};
		for(int index=0;index<array.length;index++)
		{
			if(index%2==0) { //index%2!=0 is for numbers in odd index
				System.out.println(array[index]);
			}
		}
		

	}

}
