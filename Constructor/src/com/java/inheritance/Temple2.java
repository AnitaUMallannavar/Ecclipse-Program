package com.java.inheritance;

import com.java.accessiblility.Temple;

 public class Temple2 extends Temple {
       public Temple2() {
    	   System.out.println("no args const of Temple2");
       }
       @Override
	public String setName() {
     	  System.out.println("setting name of the temple");
     	  return "kanyakaParameshwari";
       }
}
