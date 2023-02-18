package com.java.moc;

public class Gogal {

	String brand;
	int price;
	double code;
	boolean good;

	public Gogal() {
		System.out.println("no args const of Gogal");
	}

	public Gogal(String brand) {
		this();
		this.brand = brand;
		System.out.println("args const of Gogal");
	}

	public Gogal(String brand, boolean good) {
		this(brand);
		this.good = good;
		System.out.println("args const of Gogal");
	}

	public Gogal(String brand, boolean good, int price) {
		this(brand, good);
		this.price = price;
		System.out.println("args const of Gogal");
	}

	public void show() {
		System.out.println("constructor chainig of Gogal");
		System.out.println(this.brand);
		System.out.println(this.good);
		System.out.println(this.price);
		System.out.println(this.code);
	}
}
