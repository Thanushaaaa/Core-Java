package com.xworkz.prime.AccessRunner;
import com.xworkz.prime.Access.Mixture;
public class MixtureRunner {

	public static void main(String[] args) {
		Mixture mixture=new Mixture();
		System.out.println(mixture);
		mixture.setColor("yellow");
		mixture.setPrice(200);
		mixture.setQuantity(500);
		mixture.setRating(4.5);
		System.out.println(mixture);

	}

}
