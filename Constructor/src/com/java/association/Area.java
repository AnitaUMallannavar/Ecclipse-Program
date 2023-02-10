package com.java.association;

public class Area {
	public String name;
	public int population;
	public String street;

	public Area(String name) {
		this.name = name;

	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void show() {
		System.out.println("Wrinting about Area...");
		System.out.println("Area name:" + this.name);
		System.out.println("Population:" + this.population);
		System.out.println("street:" + this.street);
	}

}