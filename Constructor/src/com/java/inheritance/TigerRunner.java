package com.java.inheritance;

public class TigerRunner {

	public static void main(String[] args) {
		Tiger tr = new Animal();
		boolean sr = tr.strong();
		System.out.println("Tiger is Strong :" + sr);
		Tiger tr1 = new Animal();
		boolean wl = tr1.wildAnimal();
		System.out.println("Tiger is a WildAnimal:" + wl);
		Animal an = new Animal();
		an.itIs();
		System.out.println("Tiger is a wildAnimal");
	}

}
