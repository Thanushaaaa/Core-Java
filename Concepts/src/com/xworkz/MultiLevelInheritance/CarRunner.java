package com.xworkz.MultiLevelInheritance;

public class CarRunner {

	public static void main(String[] args) {

		Car car = new Car("four wheeler", 6000, "KTM");
		car.drive();

		Car car1 = new Car();
		car1.drive();

	}
}
