package com.xworkz.array;

public class FoodItem {

	public static String[] ingredient(String foodNme) {
		if(foodNme=="Idli") {
			String[] ref= {"rawa","oil"};
			return ref;
			}
		if(foodNme=="Dosa") {
			String[] ref= {"rawa","butter"};
			return ref;
			}
		return null;
		
	}
	
	public static void main(String[] args) {
	String[] ref=ingredient("Dosa");
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]);
		}
		
		
		 ref=ingredient("Idli");
		for(int i=0;i<ref.length;i++) {
			String ref1=ref[i];
			System.out.println(ref1);
		}
				
		
	}
}
