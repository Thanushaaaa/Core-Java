package com.xworkz.Tool;

public interface Hammer {
	void work();

	default void help() {
		System.out.println("helps in doing work");
	}

}
