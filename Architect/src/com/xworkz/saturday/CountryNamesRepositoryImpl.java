package com.xworkz.saturday;

public class CountryNamesRepositoryImpl implements CountryNamesRepository {
	String[] countries = new String[NO_OF_COUNTRIES];
	int start = 0;

	@Override
	public void save(String name) {

		if (start < NO_OF_COUNTRIES) {
			System.out.println("The element at " + start + " is " + name);
			this.countries[start] = name;
			start = start + 1;
			System.out.println("The next index is " + start);
		} else {
			System.err.println("Array is full,can't store");
		}
	}

	public void display() {
		for (int position = 0; position < countries.length; position++) {
			if (countries[position] != null) {
				System.out.println("The element stored at " + position + " is " + countries[position]);
			}
		}
	}

	@Override
	public boolean isExists(String name) {
		for (start = 0; start < countries.length; start++) {
			String string = this.countries[start];
			if (string.equals(name)) {
				System.out.println("------------------------");
				return true;
			}
		}

		return false;
	}

	@Override
	public String findReturnUppercase(String name) {
		for (int index = 0; index < countries.length; index++) {
			if (countries[index].equalsIgnoreCase(name)) {
				return countries[index].toUpperCase();
			}
		}
		return null;

	}

	@Override
	public String findReturnLowercase(String name) {
		for (int start = 0; start < countries.length; start++) {
			if (countries[start].equalsIgnoreCase(name)) {
				return countries[start].toLowerCase();
			}
		}
		return null;
	}

	@Override
	public String[] findStartsWith(String name) {
		int start = 0;
		String[] temp = new String[NO_OF_COUNTRIES];
		for (int index = 0; index < countries.length; index++) {

			String string = this.countries[index];

			if (string.startsWith(name)) {

				temp[start] = string;
				start = start + 1;
			}
		}
		return temp;

	}

	@Override
	public String[] findEndsWith(String name) {
		String[] temp1 = new String[NO_OF_COUNTRIES];
		int position = 0;
		for (int index = 0; index < countries.length; index++) {
			String string = this.countries[index];
			if (string.endsWith(name)) {
				temp1[position] = string;
				position++;
			}
		}
		return temp1;

	}

	@Override
	public String[] findMatching(String name) {
		String[] temp2 = new String[NO_OF_COUNTRIES];
		int start = 0;
		for (int index = 0; index < countries.length; index++) {
			String string = this.countries[index];
			if (string.matches(name)) {
				temp2[start] = string;
				start++;
			}

		}
		return temp2;

	}

	@Override
	public void savedCount() {
		int count = 0;
		for (int start = 0; start < countries.length; start++) {
			if (countries[start] != null) {
				count = count + 1;
			}

		}
		System.out.println(count);

	}

	@Override
	public String[] orderAsc() {
		String[] temp = new String[NO_OF_COUNTRIES];
		for (int index = 0; index < NO_OF_COUNTRIES; index++) {
			for (int pos = index + 1; pos < NO_OF_COUNTRIES; pos++) {
				if (countries[index].compareTo(countries[pos]) > 0) {
					String temp1 = countries[index];
					countries[index] = countries[pos];
					countries[pos] = temp1;
				}
			}
			System.out.println("Elements in ascending order " + countries[index]);
		}
		System.out.println("=========================================");
		return temp;
	}

	@Override
	public String[] orderDesc() {
		String[] temp = new String[NO_OF_COUNTRIES];
		for (int index = 0; index < NO_OF_COUNTRIES; index++) {
			for (int pos = index + 1; pos < NO_OF_COUNTRIES; pos++) {
				if (countries[index].compareTo(countries[pos]) < 0) {
					String temp1 = countries[index];
					countries[index] = countries[pos];
					countries[pos] = temp1;
				}
			}

			System.out.println("Elements in descending order " + countries[index]);
		}
		return temp;
	}

}
