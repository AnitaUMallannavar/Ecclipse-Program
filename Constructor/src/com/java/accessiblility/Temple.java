package com.java.accessiblility;

public class Temple {
      public String name;
      
      public Temple() {
    	  System.out.println("no args const of Temple");
      }
      
      public String setName() {
    	  System.out.println("setting name of the temple");
    	  return this.name;
      }
}
