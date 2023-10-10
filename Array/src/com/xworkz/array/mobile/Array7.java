package com.xworkz.array.mobile;

public class Array7 { // printing square and cube root,power of a number

	public static void main(String[] args) {
		int[] array = { 2, 3, 67, 87, 34, 21 };
		for (int index = 0; index < array.length; index++) {
			System.out.println(Math.sqrt(array[index]));
			System.out.println(Math.pow(array[index], 3));
			System.out.println(Math.pow(array[index], 4));
		}

	}

}
