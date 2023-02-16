package com.java.inheritance;

public class Animal extends Tiger {
     public Animal() {
    	 System.out.println("no args const of Animal");
     }
     public void itIs() {
    	 System.out.println("tiger");
     }
     @Override
     public boolean wildAnimal() {
 		return true;
 	}
}
