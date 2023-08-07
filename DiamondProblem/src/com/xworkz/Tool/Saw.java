package com.xworkz.Tool;

public interface Saw extends Hammer {
	@Override
	void work();

	default void function() {
		System.out.println("functions of saw");
	}

}
