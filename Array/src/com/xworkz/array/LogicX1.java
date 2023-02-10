package com.xworkz.array;

public class LogicX1 {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 1 && j == 5 || i == 2 && j == 4
						|| i == 4 && j == 2 || i == 5 && j == 1 || i == 4 && j == 4 || i == 5 && j == 5) {
					System.out.print(j+" ");//("* ")
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
