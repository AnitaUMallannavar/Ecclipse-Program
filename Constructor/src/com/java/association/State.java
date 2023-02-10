package com.java.association;

public class State {
	public String name;
	public String cmName;
	public String language;
	public City city;

	public State(String name, String cmName) {

		this.name = name;
		this.cmName = cmName;
	}

	public void setLanguqge(String language) {
		this.language = language;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void show() {
		System.out.println("Writing about State...");
		System.out.println("State name:" + this.name);
		System.out.println("cm name:" + this.cmName);
		System.out.println("Language:" + this.language);
		if (this.city != null) {
			this.city.show();
		} else {
			System.err.println("this.city is not pointing to any memory");
		}
	}

}
