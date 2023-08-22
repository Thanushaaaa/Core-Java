package com.xworkz.laptop.mouse.util;

public class ValidationUtil {

	public static boolean validateString(String string) {
		if (string != null && !string.isEmpty() && string.length() >= 3 && string.length() < 30) {
			return true;
		}
		System.err.println("Invalid data");
		return false;

	}

}
