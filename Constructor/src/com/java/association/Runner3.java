package com.java.association;

public class Runner3 {

	public static void main(String[] args) {
		Fridge fd = new Fridge(4, "Samsang");
		fd.show();
		Chocolate cl = new Chocolate("KitKat", 10, true);
		fd.init(cl);
		cl.show();
	}

}
