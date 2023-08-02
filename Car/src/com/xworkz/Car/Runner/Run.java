package com.xworkz.Car.Runner;

import com.xworkz.Car.Implementation.BmwComplete;
import com.xworkz.Car.Abstract.Mercedes;
import com.xworkz.Car.Abstract.Bmw;

public class Run {
	public static void main(String[] args) {
		Mercedes mercedes = new BmwComplete();
		mercedes.features();
		mercedes.drive();
		mercedes.price();
		Bmw bmw = (Bmw) mercedes;
		bmw.sell();
		bmw.color();
		bmw.buy();
	}

}
