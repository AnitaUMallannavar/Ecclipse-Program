package com.xworkz.array;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int vowelsCount = 0;
		int consnCount = 0;
		int space = 0;
		char ch[] = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println("vowel is :" + ch[i]);
				vowelsCount += 1;
			} else if (ch[i] == ' ') {
				System.out.println("space is" + ch[i]);
				space += 1;
			} else {
				System.out.println("consonants is:" + ch[i]);
				consnCount += 1;
			}
		}
		System.out.println("vowel count is:" + vowelsCount);
		System.out.println("consonants count is:" + consnCount);
		System.out.println("space count is:" + space);
	}

}
