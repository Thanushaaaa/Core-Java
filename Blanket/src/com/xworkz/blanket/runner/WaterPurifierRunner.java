package com.xworkz.blanket.runner;

import com.xworkz.blanket.app.WaterPurifier;
import com.xworkz.blanket.implementation.KentWaterPurifier;
import com.xworkz.blanket.user.HemaMaliniPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		
		WaterPurifier purify=new KentWaterPurifier();
		purify.filter();
		
		HemaMaliniPurifier hema=new HemaMaliniPurifier(purify);
		hema.Waterfilter();

	}

}
