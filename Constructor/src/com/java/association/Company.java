package com.java.association;

public class Company {
	public final String name;
	public String ceoName;
	public int since;
	public Address address;

	public Company(String name, String ceoName) {

		this.name = name;
		this.ceoName = ceoName;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void show() {
		System.out.println("Writing about Company.....");
		System.out.println("Company name:" + this.name);
		System.out.println("CEO name:" + this.ceoName);
		System.out.println("since:" + this.since);
		if (this.address != null) {
			this.address.show();
		} else {
			System.err.println("this.address is not pointing to any memory");
		}
	}
}
