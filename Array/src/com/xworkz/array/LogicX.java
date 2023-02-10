package com.xworkz.array;

public class LogicX {

	public static void main(String[] args) {
		int num = 8;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == j || i + j == num + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
