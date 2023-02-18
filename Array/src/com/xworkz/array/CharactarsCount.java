package com.xworkz.array;

import java.util.Scanner;

public class CharactarsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();//nextLine is method which is present in Scanner class inside java.util package
		int charCount = 0;
		char ch[] = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			charCount += 1;
		}
		System.out.println("no of charactars :" + charCount);
	}

}
