package com.java.chain;

public class Place {
	public String pName;
	public int population;
	public String state;
	public String country;
	public String district;

	public Place() {
		System.out.println("constructur without argument");
	}

	public Place(String pName) {
		this.pName = pName;
		System.out.println("Printing Place name as String");
	}

	public Place(String pName, int population) {
		this(pName);
		this.population = population;
		System.out.println("constructur with arguments");

	}

	public Place(String pName, int population,String state) {
		this(pName,population);
		this.state = state;
		System.out.println("constructur with arguments");
	}

	public Place(String pName, int population, String district, String state) {
		this(pName,population,state);
		this.district = district;
		
		System.out.println("constructur with arguments");
	}
	public Place(String pName, int population, String district, String state,String country) {
		this(pName,population,state,district);
		this.country=country;
		
		System.out.println("constructur with arguments");
	}

	public void init(String pName, int population, String district, String state, String country) {
		this.pName = pName;
		this.population = population;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	public void show() {
		System.out.println("Printing about Vijayapur place");
		System.out.println("Place name is:" + pName);
		System.out.println("population is:" + population);
		System.out.println("District name is:" + district);
		System.out.println("State name is:" + state);
		System.out.println("Contry is:" + country);
	
	}

}
