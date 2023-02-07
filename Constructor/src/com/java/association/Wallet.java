package com.java.association;

public class Wallet {
	public String brand;
	public int cost;
	public String colour;
	public Cards cards;

	public Wallet() {
		System.out.println("const without args..");
	}

	public Wallet(String brand, int cost, String colour) {
		this.brand = brand;
		this.cost = cost;
		this.colour = colour;

		System.out.println("String,String,int const with agrs.");
	}

	public void init(Cards cards) {
		this.cards = cards;
		System.out.println("initialising ");
	}

	public void show() {
		System.out.println("Writing about Wallet........");
		System.out.println("Brand is:" + brand);
		System.out.println("cost is:" + cost);
		System.out.println("colour is:" + colour);
		if (cards != null) {
			this.cards.show();
		} else {
			System.err.println("Card is not pointing to any memory..");
		}
	}
}
