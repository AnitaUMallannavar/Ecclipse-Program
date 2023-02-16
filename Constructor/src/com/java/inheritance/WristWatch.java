package com.java.inheritance;

public class WristWatch extends Clock {
	public WristWatch() {
		System.out.println("no args const of WristWatch");
	}
	public String brand() {
		return "Titan";
	}

	@Override
	public String isOn() {
		System.out.println("Clock is on");
		return "wall";
	}
}
