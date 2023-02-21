package com.java.instance21;

public class TVRunner {

	public static void main(String[] args) {
		TV tv = new TV("samsang", 420, 7.8);
		System.out.println(tv);
		TV tv2 = new TV("MI", 4888888, 5.6);
		System.out.println(tv2);
		TV tv3 = new TV("MI", 4888888, 5.6);
		System.out.println(tv3);

		boolean bn = tv.equals(tv2);
		System.out.println(bn);

		boolean bu2 = tv2.equals(tv3);
		System.out.println(bu2);

		boolean bu3 = tv3.equals(tv3);
		System.out.println(bu3);

	}

}
