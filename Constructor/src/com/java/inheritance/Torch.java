package com.java.inheritance;

public class Torch extends TubeLight {
	public Torch() {
		System.out.println("no args const of Torch");
	}

	@Override
	public int cost() {
		return 240;
	}
}
