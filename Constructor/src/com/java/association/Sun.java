package com.java.association;

public class Sun {
	public boolean shines;
	public boolean looks;

	public Sun() {
		System.out.println("cont without args..");
	}

	public Sun(boolean shines, boolean looks) {
		this.shines = shines;
		this.looks = looks;
		System.out.println("cont with boolean,boolean args....");
	}

	public void show() {
		System.out.println("Printing about Sun......");
		System.out.println("Sun is shinning:" + shines);
		System.out.println("Sun is visible:" + looks);
	}
}
