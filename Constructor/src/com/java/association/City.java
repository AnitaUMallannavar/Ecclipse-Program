package com.java.association;

public class City {
	public String name;
	public String district;
	public boolean capital;
	public Area area;

	public City(String name, String district) {
		System.out.println("String,String args constructor");
		this.name = name;
		this.district = district;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void show() {
		System.out.println("Wrinting about City....");
		System.out.println("City name:" + this.name);
		System.out.println("City district:" + this.district);
		System.out.println("It is capital:" + this.capital);
		if (this.area != null) {
			this.area.show();
		} else {
			System.err.println("this.area is null");
		}

	}
}
