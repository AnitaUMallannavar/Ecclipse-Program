package com.java.inheritance;

public class PaniPuriRunner {

	public static void main(String[] args) {
		PaniPuri pp = new MasalaPuri();
		int price = pp.cost();
		System.out.println("PaniPuri rete is:" + price);
		PaniPuri pp1 = new MasalaPuri();
		boolean bl = pp1.testy();
		System.out.println("panipuri is testy:" + bl);
	}

}
