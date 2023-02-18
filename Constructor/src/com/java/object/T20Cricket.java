package com.java.object;

public class T20Cricket extends ODICricket {
     public T20Cricket() {
    	 System.out.println("no args const of T20Cricket");
     }
     public String getSponsorName() {
    	 return "SponsorName";
     }
     @Override
     public String getGroundName() {
 		return "polo";
 	}
     
}
