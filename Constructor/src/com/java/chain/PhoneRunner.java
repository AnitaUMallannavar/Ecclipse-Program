package com.java.chain;

public class PhoneRunner {
      public static void main(String[] args) {
    	  Phone pn=new Phone("realme","128gb",13000,true,true,"#751986329");
    	  pn.show();
    	  System.out.println("---------");
    	  Phone po=new Phone("xxxx","16gbRam",12000,true);
    	  po.show();
    	  System.out.println("---------");
    	  Phone pn1=new Phone("1+","120");
    	  pn1.show();
    	  System.out.println("---------");
    	  Phone pn2=new Phone("redme","86754",987654);
    	  pn2.show();
    	  System.out.println("---------");
    	  Phone pn3=new Phone("realme","128gb",13000,true,true);
    	  pn3.show();
    	  System.out.println("---------");
      }
}
