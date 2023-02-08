package com.java.association;

public class Degree {
	public String name;
	public int duration;
	public boolean pursuing;
	public double persentage;
	public String branch;

	public Degree() {
		System.out.println("no args constructor of Degree");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setPursuing(boolean pursuing) {
		this.pursuing = pursuing;
	}

	public void setPersentage(double persentage) {
		this.persentage = persentage;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void display() {
		System.out.println("Writing about Degree");
		System.out.println("Degree name is:" + this.name);
		System.out.println("duration:" + this.duration);
		System.out.println("is pursuing:" + this.pursuing);
		System.out.println("Persentage:" + this.persentage);
		System.out.println("Branch:" + this.branch);
	}
}
