package com.Xworkz.code;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Mobile("Black");
		mobile.brand=MobileBrand.REDMI;
		mobile.price=90303;
		mobile.display();
		Mobile mobile1=new Mobile("Red");
		mobile1.brand=MobileBrand.APPLE;
		mobile1.price=1000303;
		mobile1.display();
		// TODO Auto-generated method stub

	}

}
