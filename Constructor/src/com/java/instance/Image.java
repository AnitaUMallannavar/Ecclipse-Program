package com.java.instance;

public class Image {
          public double size;
          public String type;
          public String colour;
          public String shepe;
          public int cast;
          public int number;
          public boolean good;
          public boolean vicible;
          public String coad;
          public String capturedby;
          
          
          public  Image() {
        	  System.out.println("no args");
          }
          public Image(double val) { 
        	  System.out.println("with args");
        	  size=val;
          }
          public Image(String val) { 
        	  System.out.println("with args");
        	  type=val;
          }
          public Image(double val,String val1) { 
        	  System.out.println("with args");
        	  size=val;
        	  colour=val1;
          }
          public Image(double val,boolean val2) { 
        	  System.out.println("with args");
        good=val2;
        size=val;
          }
          public Image(boolean val,boolean val2) { 
        	  System.out.println("with args");
        	  vicible=val;
        	  good=val2;
          }
          public Image(int val,boolean val2) { 
        	  System.out.println("with args");
        	  cast=val;
        	  vicible=val2;
          }
          public Image(int val,String val2) { 
        	  System.out.println("with args");
        	  cast=val;
        	  coad=val2;
          }
          public Image(String val,String val3) { 
        	  System.out.println("with args");
        	  type=val;
        	  shepe=val3;
          }
          public void show() {
        	  System.out.println("Image size is:" +size);
        	  System.out.println("Image type is:" +type);
        	  System.out.println("Image colour is:" +colour);
        	  System.out.println("Image shepe is:" +shepe);
        	  System.out.println("Image price is:" +cast);
        	  System.out.println("they got Image:" +number);
        	  System.out.println("Image is good:" +good);
        	  System.out.println("Image  is vicible:" +vicible);
        	  System.out.println("Image coad is:" +coad);
        	  System.out.println("Image is captured by:" +capturedby);
        	  
          }
}
