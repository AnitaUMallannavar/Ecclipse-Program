package com.java.instance21;

public class ParkRunner {

	public static void main(String[] args) {
		Park pk = new Park("xyz", 25, 15, 5, true, true);
		System.out.println(pk);

		Park pk1 = new Park("abc", 34, 26, 4, true, true);
		System.out.println(pk1);

		Park pk3 = new Park("xyz", 25, 15, 5, true, true);
		System.out.println(pk3);

		boolean bn = pk.equals(pk3);
		System.out.println(bn);

		boolean bn1 = pk1.equals(pk3);
		System.out.println(bn1);

	}

}
