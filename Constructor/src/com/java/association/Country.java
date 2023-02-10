package com.java.association;

public class Country {
	public String name;
	public String president;
	public boolean developed;
	public State state;

	public Country(String name, String president) {
		this.name = name;
		this.president = president;
	}

	public void setDeveloped(boolean developed) {
		this.developed = developed;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void show() {
		System.out.println("Writing about Country..");
		System.out.println("Country name:" + this.name);
		System.out.println("President:" + this.president);
		System.out.println("it is developed Country:" + this.developed);
		if (this.state != null) {
			this.state.show();
		} else {
			System.err.println("this.state is not pointing to any memory");
		}
	}
}
