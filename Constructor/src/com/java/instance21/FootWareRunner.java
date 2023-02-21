package com.java.instance21;

public class FootWareRunner {

	public static void main(String[] args) {
		FootWare foot = new FootWare("Bata", 6, "lether");
		System.out.println(foot);
		FootWare foot1 = new FootWare("paragan", 5, "lether");
		System.out.println(foot1);
		FootWare foot2 = new FootWare("paragan", 5, "lether");
		System.out.println(foot2);
		boolean bl = foot.equals(foot1);
		System.out.println(bl);

		boolean bl1 = foot1.equals(foot);
		System.out.println(bl1);

		boolean bl2 = foot1.equals(foot2);
		System.out.println(bl2);
	}

}
