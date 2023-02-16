package com.java.inheritance;

public class SoilRunner {

	public static void main(String[] args) {
		Soil soil = new TypesOfSoil();
		boolean bl = soil.good();
		System.out.println("Soil is good " + bl);
		TypesOfSoil tos=new TypesOfSoil();
		boolean bl1=tos.smells();
		System.out.println("Soil have smell "+bl1);
		
		System.out.println("          ");
		
	}

	
}
