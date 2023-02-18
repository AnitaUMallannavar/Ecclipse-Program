package com.java.accessiblility;

public class Sound {
   
	protected class A {
		protected int a;
		
		protected A(){
			System.out.println("no args const of A class");
		}
		
		public void setA() {
			System.out.println("++++++++");
		}
	}
	protected Sound() {
		System.out.println("no args const of Sound");
	}
	public boolean setVibration() {
		System.out.println("vibration setting");
		return true;
	}
	
	
}
