package com.xworkz.sunday;

import com.xworkz.saturday.*;

public class CountryNamesRunner {

	public static void main(String[] args) {
		CountryNamesRepository countryNamesRepository = new CountryNamesRepositoryImpl();
		countryNamesRepository.save("India");
		countryNamesRepository.save("Africa");
		countryNamesRepository.save("France");
		countryNamesRepository.save("America");
		countryNamesRepository.save("England");
		countryNamesRepository.save("Korea");
		countryNamesRepository.save("China");
		countryNamesRepository.save("Poland");
		countryNamesRepository.save("Japan");
		countryNamesRepository.save("Australia");
		countryNamesRepository.display();
		System.out.println(countryNamesRepository.isExists("Poland"));
		System.out.println(countryNamesRepository.findReturnUppercase("India"));
		System.out.println(countryNamesRepository.findReturnLowercase("England"));
		String[] ref = countryNamesRepository.findStartsWith("A");

		for (int index = 0; index < ref.length; index++) {
			if (ref[index] != null) {

				System.out.println("The country starting with given letters is " + ref[index]);
			}
		}
		String[] ref1 = countryNamesRepository.findEndsWith("n");
		for (int index = 0; index < ref1.length; index++) {
			if (ref1[index] != null) {
				System.out.println("The country ending with given letters is " + ref1[index]);
			}
		}
		String[] ref2 = countryNamesRepository.findMatching("America");
		for (int index = 0; index < ref2.length; index++) {
			if (ref2[index] != null) {
				System.out.println("The country having given letters is " + ref2[index]);
			}
		}
		countryNamesRepository.savedCount();
		countryNamesRepository.orderAsc();
		countryNamesRepository.orderDesc();

	}

}
