package com.java.association;

public class Sunrise {
	public String lenght;
	public boolean harms;
	public Sun sun;

	public Sunrise() {
		System.out.println("const without args.");
	}

	public Sunrise(String lenght, boolean harms) {
		this.lenght = lenght;
		this.harms = harms;
		System.out.println("const with boolean,String args..");
	}

	public void init(Sun sun) {
		this.sun = sun;
		System.out.println("init method");
	}

	public void show() {
		System.out.println("Printing about Sunrise.........");
		System.out.println("lenght is:" + lenght);
		System.out.println("is it harms:" + harms);
		if (sun != null) {
			this.sun.show();
		} else {
			System.err.println("Sun is not pointing to any memory");
		}
	}
}
