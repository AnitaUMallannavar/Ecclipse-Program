package com.java.association;

public class Box {
	public double size;
	public String shepe;

	public Box() {
		System.out.println("const without any args..");
	}

	public Box(double size, String shepe) {
		this.size = size;
		this.shepe = shepe;
		System.out.println("const with double,String arguments..");
	}

	public void show() {
		System.out.println("Writing about GiftBox:....");
		System.out.println("size is:" + size);
		System.out.println("shepe is:" + shepe);
	}
}
