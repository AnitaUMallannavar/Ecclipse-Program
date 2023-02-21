package com.java.instance21;

public class AlcoholRunner {

	public static void main(String[] args) {
		Alcohol ak = new Alcohol("String", 46, 420, "water");
		System.out.println(ak);

		Alcohol ak1 = new Alcohol("String", 46, 420, "water");
		System.out.println(ak1);

		Alcohol ak2 = new Alcohol("String", 78, 420, "asid");
		System.out.println(ak2);

		boolean bol = ak1.equals(ak2);
		System.out.println(bol);

		boolean bol2 = ak.equals(ak2);
		System.out.println(bol2);

	}

}
