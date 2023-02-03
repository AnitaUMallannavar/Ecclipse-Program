package com.java.chain;

public class Gogal {
         public String brand;
         public int cast;
         public String colour;
         public boolean good;
         public boolean visible;
         public String name;
         public boolean quality;
         public String validity;
         public long coad;
         public char size;
         
         public Gogal() {
        	 System.out.println("const without  args");
         }
         public Gogal(String brand) {
        	 this();
        	 this.brand=brand;
        	 System.out.println("const with args");
         }
         public Gogal(String colour,String name,String validity,String brand) {
        	 this(brand);
        	 this.colour=colour;
        	 this.name=name;
        	 this.validity=validity;
        	 System.out.println("const with args");
         }
         public Gogal(boolean good,boolean visible,boolean quality,String brand,String colour,String name,String validity) {
             this(colour,name,validity,brand);
        	 this.good=good;
        	 this.visible=visible;
        	 this.quality=quality;
        	 System.out.println("const with args");
         }
         public Gogal(int cast,long coad,char size) {
        	 this.cast=cast;
        	 this.coad=coad;
        	 this.size=size;
        	 System.out.println("const with args");
         }
         public Gogal(String brand,int cast,String colour,boolean good,boolean visible,String name,boolean quality,String validity,long coad,char size) {
        	 this(colour,name,brand,validity);
        	 
        	System.out.println("const with args");
         }
         public void init(String brand,int cast,String colour,boolean good,boolean visible,String name,boolean quality,String validity,long coad,char size) {
         	this.brand=brand;
         	this.cast=cast;
        	this.colour=colour;
        	this.good=good;
        	this.visible=visible;
        	this.name=name;
        	this.quality=quality;
        	this.validity=validity;
        	this.coad=coad;
        	this.size=size;
        	System.out.println("const with args");
         }
         public void show() {
        	 System.out.println("Gogal information..");
        	 System.out.println("brand:"+brand);
        	 System.out.println("cast:"+cast);
        	 System.out.println("colour:"+colour);
        	 System.out.println("good:"+good);
        	 System.out.println("visible:"+visible);
        	 System.out.println("name:"+name);
        	 System.out.println("quality:"+quality);
        	 System.out.println("validity:"+validity);
        	 System.out.println("coad:"+coad);
        	 System.out.println("size:"+size);
         }
}
