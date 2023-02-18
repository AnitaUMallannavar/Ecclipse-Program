package com.xworkz.array;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int spaceCount = 0;
        //int charCount=0;
		char ch[] = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				spaceCount += 1;

			}
		}
		System.out.println("no of space :" + spaceCount);
	}

}
