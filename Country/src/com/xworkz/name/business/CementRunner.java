package com.xworkz.name.business;

import com.xworkz.name.Cement;

public class CementRunner {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cement cement = new Cement();
		cement.setPrice(3000);
		cement.setBrandAmbassidor("Rana");
		cement.setBrandName("Ambuja");
		cement.setLocation("Pune");
		cement.setOwnerName("Vivek");
		Cement cement1 = (Cement) cement.clone();
		cement1.setPrice(4000);
		cement1.setBrandAmbassidor("Prabhas");
		cement1.setBrandName("Ankitha");
		cement1.setLocation("Banglore");
		cement1.setOwnerName("Vinay");
		System.out.println(cement.toString());
		System.out.println(cement1.toString());

		Cement cement2 = (Cement) cement.clone();
		cement2.setPrice(5000);
		cement2.setBrandAmbassidor("Ayushman");
		cement2.setBrandName("Ramco");
		cement2.setLocation("Mysore");
		cement2.setOwnerName("Ajay");
		System.out.println(cement.toString());
		System.out.println(cement2.toString());

		Cement cement3 = (Cement) cement.clone();
		cement3.setPrice(6000);
		cement3.setBrandAmbassidor("Mahesh babu");
		cement3.setBrandName("ACC");
		cement3.setLocation("Chennai");
		cement3.setOwnerName("Akshara");
		System.out.println(cement.toString());
		System.out.println(cement3.toString());

		Cement cement4 = (Cement) cement.clone();
		cement4.setPrice(7000);
		cement4.setBrandAmbassidor("NTR");
		cement4.setBrandName("Jk cement");
		cement4.setLocation("Kerala");
		cement4.setOwnerName("Vicky");
		System.out.println(cement.toString());
		System.out.println(cement4.toString());

		Cement cement5 = (Cement) cement.clone();
		cement5.setPrice(7000);
		cement5.setBrandAmbassidor("Ram charan");
		cement5.setBrandName("India cements");
		cement5.setLocation("Mumbai");
		cement5.setOwnerName("Arjun");
		System.out.println(cement.toString());
		System.out.println(cement5.toString());

		Cement cement6 = (Cement) cement.clone();
		cement6.setPrice(8000);
		cement6.setBrandAmbassidor("Ranveer");
		cement6.setBrandName("Birla");
		cement6.setLocation("Hyderabad");
		cement6.setOwnerName("Harshad");
		System.out.println(cement.toString());
		System.out.println(cement6.toString());

		Cement cement7 = (Cement) cement.clone();
		cement7.setPrice(9000);
		cement7.setBrandAmbassidor("Abhishek");
		cement7.setBrandName("JSW");
		cement7.setLocation("Chennai");
		cement7.setOwnerName("Sagar");
		System.out.println(cement.toString());
		System.out.println(cement7.toString());

		Cement cement8 = (Cement) cement.clone();
		cement8.setPrice(10000);
		cement8.setBrandAmbassidor("Sanjay");
		cement8.setBrandName("Holcim");
		cement8.setLocation("Banglore");
		cement8.setOwnerName("Tina");
		System.out.println(cement.toString());
		System.out.println(cement8.toString());

		Cement cement9 = (Cement) cement.clone();
		cement9.setPrice(11000);
		cement9.setBrandAmbassidor("Ranbeer");
		cement9.setBrandName("Dalmina");
		cement9.setLocation("Kolkata");
		cement9.setOwnerName("Riyaz");
		System.out.println(cement.toString());
		System.out.println(cement9.toString());

		Cement cement10 = (Cement) cement.clone();
		cement10.setPrice(12000);
		cement10.setBrandAmbassidor("Shahrukh khan");
		cement10.setBrandName("Ultratech");
		cement10.setLocation("Mysore");
		cement10.setOwnerName("Ankitha");
		System.out.println(cement.toString());
		System.out.println(cement10.toString());

	}
}
