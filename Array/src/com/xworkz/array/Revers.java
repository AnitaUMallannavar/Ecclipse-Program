package com.xworkz.array;

public class Revers {

	public static void main(String[] args) {
		String name = "umesh ";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			System.out.println(rev);//(i)
		}
		System.out.println(rev);
	}
}
