package com.Xworkz.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate past = LocalDate.of(2020, 11, 22);
		System.out.println(past);

		LocalDate future = LocalDate.of(2024, 11, 10);
		System.out.println(future);

		boolean check = localDate.isAfter(past);
		System.out.println(check);

		boolean check2 = localDate.isBefore(past);
		System.out.println(check2);

		boolean check3 = localDate.isEqual(past);
		System.out.println(check3);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		LocalDateTime past1 = LocalDateTime.of(2020, 6, 4, 2, 30, 50, 9);
		System.out.println(past1);

		boolean check6 = localDateTime.isAfter(past1);
		System.out.println(check6);

		LocalDateTime future1 = LocalDateTime.of(2025, 6, 4, 2, 30, 50, 9);
		System.out.println(future1);

		boolean check4 = localDateTime.isBefore(future1);
		System.out.println(check4);

		boolean check5 = localDateTime.isEqual(future1);
		System.out.println(check5);

	}

}
