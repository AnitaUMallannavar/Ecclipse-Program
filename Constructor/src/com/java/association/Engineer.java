package com.java.association;

public class Engineer {
	public String name = "Ravi";
	public double salary = 7.2;
	public String[] skills;
	public Degree[] degrees;

	public Engineer() {
		System.out.println("no args conts of Engineer");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setDegrees(Degree[] degrees) {
		this.degrees = degrees;
	}

	public void display() {
		System.out.println("Writing about Engineer..");
		System.out.println(this.name);
		System.out.println(this.salary);

		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String element = this.skills[seq];
				System.out.println("skills :" + element + " At index " + seq);
			}

		} else {
			System.out.println("skills are not null.");
		}
		if (this.degrees != null) {
			for (int num = 0; num < this.degrees.length; num++) {
				Degree element = this.degrees[num];
				element.display();
			}
		} else {
			System.out.println("Degree is not null...");
		}
	}
}
