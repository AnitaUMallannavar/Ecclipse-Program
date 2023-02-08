package com.java.association;

public class Scientist {
	public String name;
	public String designation;

	public Scientist() {
		System.out.println("no args conts of Scientist");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println("Wrinting about scientist");
		System.out.println("name:" + name);
		System.out.println("designation :" + designation);
	}
}
