package com.java.association;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro = new Isro();
		String[] loc = { "Mysor", "Bangalor", "Tumkur" };
		isro.setLocation(loc);
		int[] it = { 12, 13, 18 };
		isro.setScientistNos(it);
		Scientist scientist = new Scientist();
		scientist.setName("CV raman");
		scientist.setDesignation("Scientist");
		Scientist scientist1 = new Scientist();
		scientist1.setName("CV raman");
		scientist1.setDesignation("Scientist");

		Scientist[] ref = { scientist, scientist1 };
		isro.setScientists(ref);
		isro.display();

	}
}
