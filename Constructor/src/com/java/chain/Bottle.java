package com.java.chain;

public class Bottle {
        public String brand;
        public double hight;
        public double wight;
        public String colour;
        public boolean good;
        public String liter;
        public int cast;
        
        
        
        
        public Bottle() {
        	System.out.println("cont without args");
        }
        public Bottle(String brand) {
        	this.brand=brand;
        	System.out.println("cont with args");
        }
        public Bottle(String brand,double hight) {
        	this(brand);
        	this.hight=hight;
        	System.out.println("cont with args");
        }
        public Bottle(String brand,double hight,double wight) {
        	this(brand,hight);
        	this.wight=wight;
        	System.out.println("cont with args");
        }
        public Bottle(String brand,double hight,double wight,String colour) {
        	this(brand,hight,wight);
        	this.colour=colour;
        	System.out.println("cont with args");
        }
        public Bottle(String brand,double hight,double wight,String colour,boolean good) {
        	this(brand,hight,wight,colour);
        	this.good=good;
        	System.out.println("cont with args");
        }
        public Bottle(String brand,double hight,double wight,String colour,boolean good,int cast) {
        	this(brand,hight,wight,colour,good);
        	this.cast=cast;
        	System.out.println("cont with args");
        }
        
        public void init(String brand,double hight,double wight,String colour,boolean good,int cast) {
        	this.brand=brand;
        	this.hight=hight;
        	this.wight=wight;
        	this.colour=colour;
        	this.good=good;
        	this.cast=cast;
        }
        public void show() {
        	System.out.println("Printing about Bottle");
        	System.out.println("Brand:"+brand);
        	System.out.println("Hight:"+hight);
        	System.out.println("wight:"+wight);
        	System.out.println("colour:"+colour);
        	System.out.println("good:"+good);
        	System.out.println("cast:"+cast);
        }
}
