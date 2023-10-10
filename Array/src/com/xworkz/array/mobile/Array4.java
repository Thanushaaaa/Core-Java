package com.xworkz.array.mobile;

public class Array4 { // Adding elements in the array

	public static void main(String[] args) {
		int[] array = { 67, 11, 0, 45, 87 };
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];

		}
		System.out.println(sum);

	}

}
