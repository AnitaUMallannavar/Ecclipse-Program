package com.java.pack;

public class Umbrella {
        public String shape;
        public int cast;
        public double hight;
        public double wight;
        public String colour;
        public String size;
        public String material;
        public boolean use;
        public boolean good;
        public boolean quality;
        
        
        public Umbrella(String shape,int cast,double hight,double wight,String colour,String size,
        		String material,boolean use,boolean good,boolean quality) {
        	System.out.println("--------------");
        	this.shape=shape;
        	this.cast=cast;
        	this.hight=hight;
        	this.wight=wight;
        	this.colour=colour;
        	this.size=size;
        	this.material=material;
        	this.use=use;
        	this.good=good;
        	this.quality=quality;
        }
        public void show() {
        	System.out.println("umbrella shape is:"+shape);
        	System.out.println("umbrella price is:"+cast);
        	System.out.println("umbrella hight is:"+hight);
        	System.out.println("umbrella wight  is in gramm:"+wight);
        	System.out.println("umbrella colour is:"+colour);
        	System.out.println("umbrella size is:"+size);
        	System.out.println("umbrella madeup of is:"+material);
        	System.out.println("umbrella is useble:"+use);
        	System.out.println("umbrella is good:"+good);
        	System.out.println("umbrella quality is :"+quality);
        }
        
}
