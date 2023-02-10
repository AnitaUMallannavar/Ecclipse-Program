package com.java.association;

public class Address {
	public Country country;

	public void setCountry(Country country) {
		this.country = country;
	}

	public void show() {
		System.out.println("Writing about Address...");
		if (this.country != null) {
			this.country.show();
		} else {
			System.err.println("this.country is not pointing to any memory..");
		}
	}
}
