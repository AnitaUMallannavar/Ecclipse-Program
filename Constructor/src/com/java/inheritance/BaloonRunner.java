package com.java.inheritance;

public class BaloonRunner {

	public static void main(String[] args) {
		Baloon bal = new BeanBag();
		int rate = bal.cost();
		System.out.println(rate);
		BeanBag bb = new BeanBag();
		double dl = bb.expands();
		System.out.println(dl);
	}

}
