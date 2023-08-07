package com.xworkz.Tool;

public interface Axe extends Hammer {
	@Override
	void work();

	default void sharp() {
		System.out.println("sharp in axe");
	}

}
