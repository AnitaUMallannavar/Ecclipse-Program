package com.java.instance;

public class FrenchFry {
	public boolean smells;
    public String quantity;
    public String quality;
    public int cast;
    public String madeIn;
    public String expair;
    public String madeby;
    public boolean heldy;
    public String madewith;
    public String calories;
    public boolean testy;
    public FrenchFry() {
		System.out.println("==========");
	}
    public FrenchFry(boolean val) {
		System.out.println("const with args");
		smells=val;
	}
    public FrenchFry(String val) {
		System.out.println("const with args");
		quality=val;
	}
    public FrenchFry(String val,String val1) {
		System.out.println("const with args");
		quality=val;
		quantity=val1;
	}
    public FrenchFry(String val,boolean val1) {
		System.out.println("const with args");
		madeIn=val;
		heldy=val1;
	}
    public FrenchFry(boolean val,String val2) {
		System.out.println("const with args");
		quality=val2;
		testy=val;
	}
    public FrenchFry(int val) {
		System.out.println("const with args");
		cast=val;
	}
    public FrenchFry(String val,int val2) {
		System.out.println("const with args");
		quality=val;
		cast=val2;
	}
    public FrenchFry(String val,String val1,String val2) {
		System.out.println("const with args");
		quality=val;
		quantity=val1;
		madeIn=val2;
	}
    public FrenchFry(String val,boolean val2,boolean val3) {
		System.out.println("const with args");
		quality=val;
		testy=val2;
		smells=val3;
	}
    public FrenchFry(boolean val,int val2) {
		System.out.println("const with args");
		testy=val;
		cast=val2;
	}
    public void show() {
    	
    	System.out.println("Biryani  is smells:"+smells);
		   System.out.println("Biryani quality is good:"+quality);
		   System.out.println("Biryani quantity is good:"+quantity);
		   System.out.println("Biryani cast is:"+cast);
		   System.out.println("Biryani  is madein:"+madeIn);
		   System.out.println("Biryani will be expairs:"+expair);
		   System.out.println("Biryani  is madeby:"+madeby);
		   System.out.println("Biryani is heldy:"+heldy);
		   System.out.println("Biryani madewith is:"+madewith);
		   System.out.println("Biryani cantance caloris like:"+calories);
		   System.out.println("Biryani is testy:"+testy);
    }
}
