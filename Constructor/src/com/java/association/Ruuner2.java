package com.java.association;

public class Ruuner2 {

	public static void main(String[] args) {
		Sunrise sr = new Sunrise("300000000000000000", false);
		sr.show();
		Sun sn = new Sun(true, true);
		sr.init(sn);
		sn.show();

	}

}
