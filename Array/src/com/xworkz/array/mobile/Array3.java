package com.xworkz.array.mobile;

public class Array3 { // printing odd and even numbers of array

	public static void main(String[] args) {
		int[] array = { 45, 11, 90, 54, 12, 3, 6, 91 };
		int index;
		//int sum=0; for sum of even numbers
		for (index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0) {
				System.out.println(array[index]);
				//sum=sum+array[index];  * in place of + for product problems
			}
			

		}
		//System.out.println(sum);
		System.out.println("------------------------------------");
		for (index = 0; index < array.length; index++) {
			if (array[index] % 2 != 0) {
				System.out.println(array[index]);
			}
		}

	}

}
