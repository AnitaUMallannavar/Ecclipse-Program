package com.java.inheritance;

public class TypesOfSoil extends Soil {
	public TypesOfSoil() {
		System.out.println("no args const of Typeofsoil");
	}

	@Override
	public boolean good() {
		System.out.println("overriding soil");
		return false;
	}

}
