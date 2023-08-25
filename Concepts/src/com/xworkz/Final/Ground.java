package com.xworkz.Final;

public class Ground {
	public final int length = 9087;
	public final String game;

	public Ground(String game) {
		this.game = game;
	}

	public final void display() {
		System.out.println(length);
		System.out.println(game);
		System.out.println("Invoking method in ground");
	}

}
