package com.java.association;

public class Button {
	public String shepe;
	public int cost;
	public boolean good;

	public Button(String shepe, int cost, boolean good) {
		this.shepe = shepe;
		this.cost = cost;
		this.good = good;
		System.out.println("constructor with String,int,boolean arguments..");
	}

	public void show() {
		System.out.println("Writing about Sweater Button...");
		System.out.println("shepe is:" + shepe);
		System.out.println("cost is:" + cost);
		System.out.println("it is good:" + good);
	}
}
