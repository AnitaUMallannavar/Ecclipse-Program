package com.java.association;

public class Isro {
	public String[] location;
	public int[] scientistNos;
	public Scientist[] scientists;

	public Isro() {
		System.out.println("no args constructor of Isro..");
	}

	public void setLocation(String[] location) {
		this.location = location;
	}

	public void setScientistNos(int[] scientistNos) {
		this.scientistNos = scientistNos;
	}

	public void setScientists(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void display() {
		System.out.println("Writing About Isro..");

		if (this.location != null) {
			for (int seq = 0; seq < this.location.length; seq++) {
				String element = this.location[seq];
				System.out.println("location:" + element + " at index" + seq);
			}
		} else {
			System.out.println("location is not null..");
		}
		if (this.scientistNos != null) {
			for (int num = 0; num < this.scientistNos.length; num++) {
				int element = this.scientistNos[num];
				System.out.println("no of scientist :" + element + " At index" + num);
			}
		} else {
			System.out.println("this.scientistNos is null");
		}
		if (this.scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientist element = this.scientists[seq];
				element.display();
			}
		} else {
			System.out.println("scientists is null");
		}
	}

}
