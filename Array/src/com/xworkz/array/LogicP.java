package com.xworkz.array;

public class LogicP {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 1 || i == 3 && j == 1 || i == 4 && j == 1 || i == 5 && j == 1
						|| i == 6 && j == 1 || i == 7 && j == 1 || i == 8 && j == 1||i==1&&j==2||i==2&&j==3||i==3&&j==4) {
					System.out.print("+ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
