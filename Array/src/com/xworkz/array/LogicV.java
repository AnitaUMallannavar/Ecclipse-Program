package com.xworkz.array;

public class LogicV {

	public static void main(String[] args) {
		int num = 6;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 2 && j == 4
						|| i == 1 && j == 5 || i == 0 && j == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
