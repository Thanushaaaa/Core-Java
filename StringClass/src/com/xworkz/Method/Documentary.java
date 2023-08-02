package com.xworkz.Method;

public class Documentary {
	public static void main(String[] args) {

		String category = "History";
		char index = category.charAt(4);
		System.out.println(index);
		String result = category.concat(" class");
		System.out.println(result);
		String add = category.substring(3);
		System.out.println(add);
		int place = category.indexOf("s");
		System.out.println(place);
		String[] sub = category.split("\\s");
		System.out.println(sub);
		boolean ans = category.equalsIgnoreCase("History");
		System.out.println(ans);
		boolean yes = category.equals("History");
		System.out.println(yes);
		int val = category.compareTo("class");
		System.out.println(val);
		int val1 = category.compareToIgnoreCase("Hist");
		System.out.println(val1);
		char[] arrayc = category.toCharArray();
		System.out.println(arrayc);
		String lower = category.toLowerCase();
		System.out.println(lower);
		String upper = category.toUpperCase();
		System.out.println(upper);
		boolean no = category.isEmpty();
		System.out.println(no);
		int len = category.length();
		System.out.println(len);
		boolean check = category.startsWith("H");
		System.out.println(check);
		String get = category.replace("s", "o");
		System.out.println(get);
		String get1 = category.replaceAll("s", "i");
		System.out.println(get1);
		

		
	}

}
