package com.java.instance;

public class Message {
       public String from;
       public String to;
       public boolean send;
       public int cast;
       public boolean good;
       
       
       public Message() {
    	   System.out.println("------");
       }
       public Message(String val) {
    	   System.out.println("with args");
    	   from=val;
       }
       public Message(boolean val) {
    	   System.out.println("with args");
    	   send=val;
       }
       public Message(int val) {
    	   System.out.println("with args");
    	   cast=val;
       }
       public Message(String val,int val3) {
    	   System.out.println("with args");
    	   to=val;
    	   cast=val3;
       }
       
       
       public void show() {
    	   System.out.println("message is from:"+from);
    	   System.out.println("message is to:"+to);
    	   System.out.println("is message will send:"+send);
    	   System.out.println("message cast is :"+cast);
    	   System.out.println("message is good:"+good);      }
}
