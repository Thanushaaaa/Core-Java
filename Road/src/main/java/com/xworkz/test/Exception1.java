package com.xworkz.test;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {

		int a = 6;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block");
		}

		int count = 0;
		int[] numbers = new int[6];

		for (int i = 1; i < 6; i++) {

			try {
				System.out.println("Enter the elements of array");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				numbers[i] = num;

			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Exception caught");

			}
		}
	}
}
