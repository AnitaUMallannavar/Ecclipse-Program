package com.java.association;

public class Fridge {
	public int noOfDoors;
	public String brand;
	public Chocolate chocolate;

	public Fridge() {
		System.out.println("const without any args..");
	}

	public Fridge(int noOfDoors, String brand) {
		this.noOfDoors = noOfDoors;
		this.brand = brand;
		System.out.println("const with int,String args..");
	}

	public void init(Chocolate chocolate) {
		this.chocolate = chocolate;
		System.out.println("Chocolate");
	}

	public void show() {
		System.out.println("Writing about Fridge.....");
		System.out.println("no of doors:" + noOfDoors);
		System.out.println("brand is:" + brand);
		if (chocolate != null) {
			this.chocolate.show();
		} else {
			System.err.println("Chocolate is not pointing to any memory..");
		}
	}
}
