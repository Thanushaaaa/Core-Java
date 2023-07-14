package com.Xworkz.code;

public class ResortRunner {

	public static void main(String[] args) {
		Resort resort=new Resort("Palace");
		resort.roomType=ResortRoomType.AC;
		resort.breakFast=true;
		resort.display();
		
		Resort resort1=new Resort("Kingdom");
		resort1.roomType=ResortRoomType.NORMAL;
		resort1.breakFast=false;
		resort1.display();
		
		
		// TODO Auto-generated method stub

	}

}
