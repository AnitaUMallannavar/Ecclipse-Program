package com.java.association;

public class Chocolate {
	public String name;
	public int cost;
	public boolean good;

	public Chocolate() {
		System.out.println("const without args");
	}

	public Chocolate(String name, int cost, boolean good) {
		this.name = name;
		this.cost = cost;
		this.good = good;
		System.out.println("const with String,int,boolean args");
	}

	public void show() {
		System.out.println("Writing about Chocolate..");
		System.out.println("name:" + name);
		System.out.println("cost:" + cost);
		System.out.println("good:" + good);
	}

}
