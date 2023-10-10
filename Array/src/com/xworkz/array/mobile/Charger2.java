package com.xworkz.array.mobile;

public class Charger2 { // printing elements of array in ascending and descending order

	public static void main(String[] args) {
		int[] array = { 90, 67, 56, 32, 15, 18 };

		int temp;
		for (int index = 0; index < array.length; index++) {
			for (int value = index + 1; value < array.length; value++) {
				if (array[index] > array[value]) {// Use < for array elements in descending order
					temp = array[index];
					array[index] = array[value];
					array[value] = temp;

				}

			}
			System.out.println(array[index]);

		}

	}

}
