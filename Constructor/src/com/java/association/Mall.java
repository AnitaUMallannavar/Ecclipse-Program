package com.java.association;

public class Mall {
	public String name;
	public String ambience;
	public int totalFloors;
	public Security security;

	public Mall(String name, String ambience) {
		System.out.println("String,String args constructo of Mall");
		this.name = name;
		this.ambience = ambience;
	}

	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public void show() {
		System.out.println("Writing about Mall...");
		System.out.println("Mall name:" + this.name);
		System.out.println("Ambience is :" + this.ambience);
		System.out.println("Total no of Floors:" + this.totalFloors);
		if (this.security != null) {
			this.security.show();
		} else {
			System.err.println("this.security is null");
		}
	}
}
