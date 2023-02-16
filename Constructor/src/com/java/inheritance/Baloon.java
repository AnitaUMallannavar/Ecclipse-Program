package com.java.inheritance;

public class Baloon {
	public Baloon() {
		System.out.println("no args const of Baloon");
	}

	public double expands() {
		System.out.println("Baloon exands in CM");
		return 3.6;
	}

	public int cost() {
		System.out.println("Baloon cost is in integer");
		return 10;
	}
}
