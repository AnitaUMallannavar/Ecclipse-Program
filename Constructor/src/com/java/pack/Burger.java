package com.java.pack;

public class Burger {
          public String name;
          public boolean smell;
          public int price;
          public String size;
          public String noOfsharing;
          public boolean good;
          public String ingridients;
          public String madeby;
          public String madeto;
          public String expairy;
          public String flevor;
          public boolean veg;
          public boolean nonveg;
          public boolean testy;
          public String fat;
          
          
          public Burger(String name,boolean smell,int price,String size,String noOfsharing,boolean good,
        		  String madeby,String madeto,String expairy,String ingridients,String flevor,boolean veg,
        		  boolean nonveg,boolean testy,String fat) {
        	  System.out.println("constructar with arguments..");
        	  this.name=name;
        	  this.smell=smell;
        	  this.price=price;
        	  this.size=size;
        	  this.noOfsharing=noOfsharing;
        	  this.good=good;
        	  this.ingridients=ingridients;
        	  this.madeby=madeby;
        	  this.madeto=madeto;
        	  this.expairy=expairy;
        	  this.flevor=flevor;
        	  this.veg=veg;
        	  this.nonveg=nonveg;
        	  this.testy=testy;
        	  this.fat=fat;
        	  
          }
          public void show() {
        	  System.out.println("Bueger name is:"+name);
        	  System.out.println("Bueger has smell:"+smell);
        	  System.out.println("Bueger price is:"+price);
        	  System.out.println("Bueger size is:"+size);
        	  System.out.println("Bueger is shared by:"+noOfsharing);
        	  System.out.println("Bueger is good:"+good);
        	  System.out.println("Bueger cantaince is:"+ingridients);
        	  System.out.println("Bueger is madeby:"+madeby);
        	  System.out.println("Bueger is madeto:"+madeto);
        	  System.out.println("Bueger will expairs in:"+expairy);
        	  System.out.println("Bueger flevor is:"+flevor);
        	  System.out.println("Bueger is veg:"+veg);
        	  System.out.println("Bueger is nonveg:"+nonveg);
        	  System.out.println("Bueger is testy:"+testy);
        	  System.out.println("Bueger cantaince fat:"+fat);
        	  
          }
}
