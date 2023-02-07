package com.xworkz.array;

public class Logic3 {

	public static void main(String[] args) {
		int i, j;
		int n = 10;
		int m = 10;
		int count=1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				if (i == 1 || i == n || j == 0 || j == m ) {

					System.out.print("#");
				}
			}

			System.out.println();
		}
		count+=1;
	}

}
