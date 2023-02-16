package com.java.inheritance;

public class GarlandRunner {

	public static void main(String[] args) {
		Garland gl = new Bokke();
		int dl = gl.price();
		System.out.println("Garland rate is:" + dl);
		Garland gl1 = new Bokke();
		double dle = gl1.length();
		System.out.println("Garland length is:" + dle);
	}

}
