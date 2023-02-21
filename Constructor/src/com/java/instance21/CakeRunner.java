package com.java.instance21;

public class CakeRunner {

	public static void main(String[] args) {
		Cake cake = new Cake("Pinapal", 2, "Gitar", 420);
		System.out.println(cake);

		Cake cake2 = new Cake("Pestry", 3, "round", 320);
		System.out.println(cake2);

		Cake cake4 = new Cake("Pestry", 3, "round", 320);
		System.out.println(cake4);

		Cake cake3 = new Cake("RedWelvet", 2, "Heart", 600);
		System.out.println(cake3);

		boolean bo = cake2.equals(cake3);
		System.out.println(bo);

		boolean bo2 = cake.equals(cake3);
		System.out.println(bo2);

		boolean bo3 = cake.equals(cake2);
		System.out.println(bo3);

		boolean bo4 = cake2.equals(cake4);
		System.out.println(bo4);

	}

}
