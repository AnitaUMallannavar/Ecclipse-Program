package com.xworkz.array;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		char ch[] = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];// rev=rev+ch[i];
		}
		System.out.println("original String:" + name);
		System.out.println("reversed String:" + rev);

		if (name.equals(rev)) {
			System.out.println("its true");
		} else {
			System.out.println("its false");
		}
	}

}
