package com.xworkz.Mobile;

public class Stadium extends Ground {
	String name;

	public Stadium(int length, String game, String name) {
		super(game);
		this.name = name;
	}

	public void display1() {
		super.display();
		System.out.println(name);
	}
}
