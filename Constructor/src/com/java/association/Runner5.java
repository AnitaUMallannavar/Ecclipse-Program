package com.java.association;

public class Runner5 {

	public static void main(String[] args) {
		Sweater sw = new Sweater("Winter", 420, true);
		sw.show();
		Button bn = new Button("Round", 12, true);
		sw.init(bn);
		bn.show();
	}

}
