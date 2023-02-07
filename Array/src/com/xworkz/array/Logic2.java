package com.xworkz.array;

public class Logic2 {

	public static void main(String[] args) {
		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 0 && j == 0 || i == 1 && j == 0 || i == 1 && j == 1 || i == 2 && j == 0 || i == 2 && j == 1
						|| i == 2 && j == 2 || i == 3 && j == 0 || i == 3 && j == 1 || i == 3 && j == 2
						|| i == 3 && j == 3 || i == 3 && j == 0 || i == 4 && j == 0 || i == 4 && j == 1
						|| i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4) {
					System.out.print(i + " ");
				} else {
					System.out.println();
				}
				System.out.print("");
			}

		}

	}

}
