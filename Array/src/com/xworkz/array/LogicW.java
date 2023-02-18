package com.xworkz.array;

public class LogicW {

	public static void main(String[] args) {
		int num = 16;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 4 && j == 4 || i == 5 && j == 5
						|| i == 4 && j == 6 || i == 3 && j == 7 || i == 4 && j == 8 || i == 5 && j == 9
						|| i == 4 && j == 10 || i == 3 && j == 11 || i == 2 && j == 12||i==1&&j==13) {
					System.out.print("+ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
