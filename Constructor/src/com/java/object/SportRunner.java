package com.java.object;

public class SportRunner {

	public static void main(String[] args) {
		Cricket ck = new T20Cricket();
		String k = ck.getCoachName();
		String k1 = ck.getCountry();
		System.out.println("CoachName:" + k);
		System.out.println("Country:" + k1);
		// Cricket c1 = new Cricket();
		// String k2=c1.getClass();

		T20Cricket t20 = new T20Cricket();
		String t = t20.getGroundName();
		System.out.println("GroundName:" + t);
	}

}
