package com.java.association;

public class Runner6 {

	public static void main(String[] args) {
		SunGlass sg = new SunGlass("3.3", true);
		sg.show();

		Brand bd = new Brand("Raylet", 420);
		sg.init(bd);
		bd.show();
	}

}
