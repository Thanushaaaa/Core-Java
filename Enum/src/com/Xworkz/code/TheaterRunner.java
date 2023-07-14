package com.Xworkz.code;

public class TheaterRunner {

	public static void main(String[] args) {
		Theater theater=new Theater(800);
		theater.seatType=TheaterSeatType.GALLERY;
		theater.location="Btm";
		theater.display();
		Theater theater1=new Theater(1000);
		theater1.seatType=TheaterSeatType.STALL_SEATS;
		theater1.location="Electronic city";
		theater1.display();
		
		// TODO Auto-generated method stub

	}

}
