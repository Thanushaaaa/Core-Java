package com.Xworkz.code;

public class Resort {
	String name;
	String ownerName="Prakash";
	ResortRoomType roomType;
	boolean breakFast;
	Resort(String name)
	{
		System.out.println("Instance");
		this.name=name;
	}
	void setRoomType(ResortRoomType roomType)
	{
		this.roomType=roomType;
    }
	
	void display()
	{
		System.out.println(name);
		System.out.println(ownerName);
		System.out.println(roomType);
		System.out.println(breakFast);
	}
	
	

}
