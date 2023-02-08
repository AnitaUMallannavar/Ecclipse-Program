package com.java.association;

public class Doctor {
	public String name;
	public double expirience;
	public String[] specillization;

	public Doctor() {
		System.out.println("no args constructor of Doctor..");
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public void setExpirience(double expirience) {
		this.expirience = expirience;
	}

	public void setSpecillization(String[] specillization) {
		this.specillization = specillization;
	}

	public void display() {
		System.out.println("Writing about Doctor");
		System.out.println("expirience:" + expirience);
		if (this.specillization != null) {
			for (int seq = 0; seq < this.specillization.length; seq++) {
				String element = this.specillization[seq];
				System.out.println("specillization:" + element + "At index" + seq);
			}
		} else {
			System.out.println("specillization is not null");
		}

	}
}
