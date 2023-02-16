package com.java.inheritance;

public class BeanBag extends Baloon {
	public BeanBag() {
		System.out.println("no args const of BeanBag");
	}

	@Override
	public double expands() {
		System.out.println("is expands in");
		return 3.8;
	}
}
