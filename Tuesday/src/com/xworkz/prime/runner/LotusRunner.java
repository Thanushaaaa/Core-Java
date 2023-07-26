package com.xworkz.prime.runner;
import com.xworkz.prime.app.Lotus;
public class LotusRunner {
	public static void main(String[] args)
	{
		System.out.println("main");
		Lotus lotus=new Lotus();
		System.out.println(lotus);
		Object object =new Lotus();
		System.out.println(object.toString());
	}

}
