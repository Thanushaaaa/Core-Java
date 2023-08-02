package com.xworkz.Fashion.Run;

import com.xworkz.Fashion.Implementation.ClothesImplementation;
import com.xworkz.Fashion.Abstract.Clothes;
import com.xworkz.Fashion.Abstract.Fashion;

public class Run {
	public static void main(String[] args) {
		Fashion fashion = new ClothesImplementation();
		fashion.wear();
		fashion.buy();
		Clothes clothes = (Clothes) fashion;
		clothes.sell();
		clothes.design();
		clothes.style();

	}
}
