package com.java.association;

public class Gift {
	public String name;
	public boolean good;
	public Box box;

	public Gift(String name, boolean good) {
		this.name = name;
		this.good = good;
		System.out.println("constructor with Sting,boolean arguments..");
	}

	public void init(Box box) {
		this.box = box;
		System.out.println("box initialisation.");
	}

	public void show() {
		System.out.println("Writing about Gift...");
		System.out.println("name is:" + name);
		System.out.println("it is good:" + good);
		if (box != null) {
			this.box.show();
		} else {
			System.err.println("Box is not pointing to any memory........");
		}
	}
}
