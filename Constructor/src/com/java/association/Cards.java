package com.java.association;

public class Cards {
       public String type;
       public boolean works;
       
       public Cards() {
    	   System.out.println("const without args..");
       }
       public Cards(String type,boolean works) {
    	   this.type=type;
    	   this.works=works;
    	   System.out.println("String,boolean const ...");
       }
       public void show() {
    	   System.out.println("Writing about Cards...");
    	   System.out.println("Card type is:"+type);
    	   System.out.println("Card is working:"+works);
       }
}
