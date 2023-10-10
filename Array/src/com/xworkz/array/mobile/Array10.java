package com.xworkz.array.mobile;

public class Array10 {// Max and min elements of array
	static int[] array = { 45, 12, 1, 98 };
	static int max = array[0];
	static int min = array[0];

	public static void main(String[] args) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max) {
				max = array[index];
			}
		}
		System.out.println(max);
		for (int index = 0; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
			}
		}
		System.out.println(min);

	}

}
