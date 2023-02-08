package com.xworkz.array;

public class LogicX {

	public static void main(String[] args) {
		int num = 6;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == j || i + j == num + 1) {
					System.out.print(" * ");
				} else {
					System.out.println(" ");
				}
			}
		}
		System.out.println();

	}

}
