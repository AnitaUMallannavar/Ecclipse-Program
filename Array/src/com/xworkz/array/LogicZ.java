package com.xworkz.array;

public class LogicZ {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 1 && j == 5
						|| i == 5 && j == 1 || i == 5 && j == 2 || i == 5 && j == 3 || i == 5 && j == 4
						|| i == 5 && j == 5 || i == 2 && j == 4 || i == 3 && j == 3 || i == 4 && j == 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
