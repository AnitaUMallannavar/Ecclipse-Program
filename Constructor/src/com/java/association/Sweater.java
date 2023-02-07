package com.java.association;

public class Sweater {
	public String helpsIn;
	public int cost;
	public boolean good;
	public Button button;

	public Sweater(String helpsIn, int cost, boolean good) {
		this.helpsIn = helpsIn;
		this.cost = cost;
		this.good = good;
		System.out.println("constructor with String,int,boolean arguments");
	}

	public void init(Button button) {
		this.button = button;
		System.out.println("initialisation");
	}

	public void show() {
		System.out.println("Writing about Sweater");
		System.out.println("It Helps in:" + helpsIn);
		System.out.println("cost is:" + cost);
		System.out.println("it is good:" + good);
		if (button != null) {
			this.button.show();
		} else {
			System.err.println("Button is not pointing to any memory");
		}
	}
}
