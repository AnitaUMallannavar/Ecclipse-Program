package com.java.inheritance;

public class ClockRunner {

	public static void main(String[] args) {
		Clock cl = new WristWatch();
		String place = cl.isOn();
		System.out.println("Clock is Placed on " + place);
		WristWatch ww = new WristWatch();
		String use = ww.usedFor();
		System.out.println("usedfor " + use);
		WristWatch ww1 = new WristWatch();
		String use1 = ww1.brand();
		System.out.println("WristWatch brand: " + use1);
	}

}
