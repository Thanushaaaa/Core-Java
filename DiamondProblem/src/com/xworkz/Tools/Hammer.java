package com.xworkz.Tools;

public interface Hammer {
	void work();
	default void help()
	{
		System.out.println("helps in doing work");
	}

}
