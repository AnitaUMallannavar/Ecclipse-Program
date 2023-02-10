package com.xworkz.array;

public class Piramid {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 5 && j == 1 || i == 5 && j == 2 || i == 5 && j == 3 || i == 5 && j == 4 || i == 5 && j == 5) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
