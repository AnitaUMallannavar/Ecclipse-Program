package com.java.instance;

public class Train {
	 public String name;
     public int number;
     public int cast;
     public double time;
     public String from;
     public String to;
     public boolean go;
     public String noOfbox;
     
     public Train() {
    	 System.out.println("no args");
     }
     public Train(String val) {
    	 System.out.println("with args");
   name=val;
   }
     public Train(int val) {
    	 System.out.println("with args");
   number=val;
   }
     public Train(double val) {
    	 System.out.println("with args");
   time=val;
   }
     public Train(boolean val) {
    	 System.out.println("with args");
   go=val;
   }
     public Train(String val,String val1) {
    	 System.out.println("with args");
   from=val;
   to=val1;
   }
     public Train(String val,boolean val2) {
    	 System.out.println("with args");
   noOfbox=val;
   go=val2;
   }
     public Train(String val,int val2) {
    	 System.out.println("with args");
   name=val;
   cast=val2;
   }
     public Train(boolean val,boolean val2) {
    	 System.out.println("with args");
   go=val;
   go=val2;
     }
     public void show() {
    	 System.out.println("train name is:"+name);
    	 System.out.println("train number is:"+number);
    	 System.out.println("train ticket price is:"+name);
    	 System.out.println("train timing is:"+time);
    	 System.out.println("train is go from:"+from);
    	 System.out.println("train is going to :"+to);
    	 System.out.println("is train travells:"+go);
    	 System.out.println("train cantance no of box:"+noOfbox);
     }
}
