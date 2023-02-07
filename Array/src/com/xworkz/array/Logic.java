package com.xworkz.array;

public class Logic {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ( j == 0 && i == 0||j == 1 && i == 1 || j == 1 && i == 0|| j == 0 && i == 2||j==0 && i==1||j==2&&i==0
						) {
					System.out.print(j + " ");
				} else {
					System.out.println("");
				}

			}
		}
	}
}
//i == 2 && j == 2 || j == 2 && i == 1 || j == 2 && i == 0 ||
//
//