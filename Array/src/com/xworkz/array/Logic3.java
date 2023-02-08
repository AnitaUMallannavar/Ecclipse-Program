package com.xworkz.array;

public class Logic3 {

	public static void main(String[] args) {
		int i, j;
		int n = 10;
		int m = 10;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				if (i == 1 && j == 1 || i == 1 && j == 2 || i == 2 & j == 1 || i == 2 && j == 2) {

					System.out.print("");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}

}
