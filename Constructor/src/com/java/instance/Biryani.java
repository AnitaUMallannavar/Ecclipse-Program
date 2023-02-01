package com.java.instance;

public class Biryani {
       public String name;
       public boolean smells;
       public String quantity;
       public String quality;
       public int cast;
       public String madeIn;
       public String expair;
       public String madeby;
       public boolean heldy;
       public String madewith;
       public String calories;
       public boolean testy;
       public boolean veg;
       public boolean nonveg;
       public String hname;
       
       public Biryani() {
    	   System.out.println("no args..");
       }
       public Biryani(String val,boolean val1) {
    	   System.out.println("const with args");
    	   name=val;
    	   smells=val1;
       }
       public Biryani(boolean val,int val2) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   heldy=val;
       }
       public Biryani(String val,int val2) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   madeby=val;
       }
       public Biryani(boolean val,String val2) {
    	   System.out.println("const with args");
    	   hname=val2;
    	   heldy=val;
       }
       public Biryani(boolean val,boolean val2) {
    	   System.out.println("const with args");
    	   veg=val2;
    	   heldy=val;
       }
       public Biryani(int val,int val2) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   cast=val;
       }
       public Biryani(boolean val,int val2,boolean val3) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   heldy=val;
    	   nonveg=val3;
       }
       public Biryani(boolean val,int val2,String val1) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   heldy=val;
    	   quality=val1;
       }
       public Biryani(boolean val,int val2,int val3) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   heldy=val;
    	   cast=val3;
       }public Biryani(String val,int val2,String val3) {
    	   System.out.println("const with args");
    	   cast=val2;
    	   madeby=val;
    	   expair=val3;
       }public Biryani(String val,String val2) {
    	   System.out.println("const with args");
    	   quantity=val2;
    	   quality=val;
       }
       public Biryani(boolean val,boolean val2,boolean val3) {
    	   System.out.println("const with args");
    	   testy=val2;
    	   heldy=val;
    	   smells=val3;
       }
       public Biryani(boolean val) {
    	   System.out.println("const with args");
    	   heldy=val;
    	   val=true;
       
       }
       public Biryani(boolean val,String val1,String val2) {
    	   System.out.println("const with args");
    	   heldy=val;
    	   madewith=val1;
    	   expair=val2;
       }
       public void show() {
    	   System.out.println("Biryani name is:"+name);
    	   System.out.println("Biryani  is smells:"+smells);
    			   System.out.println("Biryani quality is good:"+quality);
    			   System.out.println("Biryani quantity is good:"+quantity);
    			   System.out.println("Biryani cast is:"+cast);
    			   System.out.println("Biryani  is madein:"+madeIn);
    			   System.out.println("Biryani will be expairs:"+expair);
    			   System.out.println("Biryani  is madeby:"+madeby);
    			   System.out.println("Biryani is heldy:"+heldy);
    			   System.out.println("Biryani madewith is:"+madewith);
    			   System.out.println("Biryani cantance caloris like:"+calories);
    			   System.out.println("Biryani is testy:"+testy);
    			   System.out.println("Biryani is veg:"+veg);
    			   System.out.println("Biryani is nonveg:"+nonveg);
    			   System.out.println("Hotel name is:"+hname);
       }
}
