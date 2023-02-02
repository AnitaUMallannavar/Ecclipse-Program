package com.java.pack;

public class Rainbow {
      public String col1;
      public String col2;
      public String col3;
      public String col4;
      public String col5;
      public String col6;
      public String col7;
      
      public Rainbow(String col1,String col2,String col3,String col4,String col5,String col6,String col7 ) {
    	  System.out.println("printing rainbow all the  colours name");
    	  this.col1=col1;
    	  this.col2=col2;
    	  this.col3=col3;
    	  this.col4=col4;
    	  this.col5=col5;
    	  this.col6=col6;
    	  this.col7=col7;
      }
      public void show() {
    	  System.out.println("Rainbow colour1 is:"+col1);
    	  System.out.println("Rainbow colour2 is:"+col2);
    	  System.out.println("Rainbow colour3 is:"+col3);
    	  System.out.println("Rainbow colour4 is:"+col4);
    	  System.out.println("Rainbow colour5 is:"+col5);
    	  System.out.println("Rainbow colour6 is:"+col6);
    	  System.out.println("Rainbow colour7 is:"+col7);
      }
}
