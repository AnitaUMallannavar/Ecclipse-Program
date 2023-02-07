package com.java.association;

public class Runner4 {

	public static void main(String[] args) {
		Gift gf = new Gift("Book", true);
		gf.show();
		Box bx = new Box(5.5, "Rectangle");
		gf.init(bx);
		bx.show();
	}

}
