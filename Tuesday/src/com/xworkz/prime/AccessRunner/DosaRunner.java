package com.xworkz.prime.AccessRunner;

import com.xworkz.prime.Access.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa = new Dosa();
		System.out.println(dosa);
		dosa.setPrice(55);
		dosa.setColor("green");
		dosa.setType("ghee");
		dosa.setMainIngredient("Cheese");
		System.out.println(dosa);

	}

}
