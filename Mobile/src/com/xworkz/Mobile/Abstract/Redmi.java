package com.xworkz.Mobile.Abstract;

public abstract class Redmi extends Mobile {
	public abstract void buy();

	public final void sell() {
		System.out.println("talk in mobile");
	}

	public void work() {
		System.out.println("study in mobile");
	}

}
