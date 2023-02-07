package com.java.association;

public class Brand {
	public String name;
	public int cost;

	public Brand(String name, int cost) {
		this.name = name;
		this.cost = cost;
		System.out.println("Constructor with String,int arguments");
	}

	public void show() {
		System.out.println("Writing about brand");
		System.out.println("name is:" + name);
		System.out.println("cost is:" + cost);
	}

}
