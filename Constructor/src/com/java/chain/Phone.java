package com.java.chain;

public class Phone {
        public String pName;
        public String storage;
        public int cast;
        public boolean good;
        public boolean android;
        public String code;
        
        
        
        public Phone() {
        	System.out.println("cont without args");
        }
        public Phone(String pName) {
        	this.pName=pName;
        	System.out.println("cont with args");
        }
        public Phone(String pName,String storage) {
        	this(pName);
        	this.storage=storage;
        	System.out.println("cont with args");
        }
        public Phone(String pName,String storage,int cast) {
        	this(pName,storage);
        	this.cast=cast;
        	System.out.println("cont with args");
        }
        public Phone(String pName,String storage,int cast,boolean good) {
        	this(pName,storage,cast);
        	this.good=good;
        	System.out.println("cont with args");
        }
        public Phone(String pName,String storage,int cast,boolean good,boolean android) {
        	this(pName,storage,cast,good);
        	this.android=android;
        	System.out.println("cont with args");
        }
        public Phone(String pName,String storage,int cast,boolean good,boolean android,String code) {
        	this(pName,storage,cast,good,android);
        	this.code=code;
        	System.out.println("cont with args");
        }
        public void init(String pName,String storage,int cast,boolean good,boolean android,String code) {
        	this.pName=pName;
        	this.storage=storage;
        	this.cast=cast;
        	this.good=good;
        	this.android=android;
        	this.code=code;
        }
        public void show() {
        	System.out.println("Phone information..");
        	System.out.println("pName:"+pName);
        	System.out.println("storage:"+storage);
        	System.out.println("cast:"+cast);
        	System.out.println("goos:"+good);
        	System.out.println("android:"+android);
        	System.out.println("code:"+code);
        }
}
