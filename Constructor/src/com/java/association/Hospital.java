package com.java.association;

public class Hospital {
	public String name;
	public Doctor[] doctors;

	public Hospital() {
		System.out.println("no args constructor of Hospital");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDoctor(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public void display() {
		System.out.println("Writing about Hospital..");
		System.out.println("Hospital name is:" + this.name);
		if (this.doctors != null) {
			for (int seq = 0; seq < this.doctors.length; seq++) {
				Doctor element = this.doctors[seq];
				element.display();
			}
		}
	}
}
