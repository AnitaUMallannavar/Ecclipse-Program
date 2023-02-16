package com.java.inheritance;

public class TubeLightRunner {

	public static void main(String[] args) {
		TubeLight tl = new Torch();
		int price = tl.cost();
		System.out.println("cost of TubeLight:" + price);
		TubeLight tl1 = new Torch();
		String sr=tl1.brand();
		System.out.println("TubeLight brand is  :"+sr);
	}

}
