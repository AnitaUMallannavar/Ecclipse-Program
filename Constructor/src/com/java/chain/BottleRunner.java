package com.java.chain;

public class BottleRunner {

	public static void main(String[] args) {
		Bottle bl=new Bottle("milton",2.4);
		bl.show();
		Bottle bl1=new Bottle("Cello",2.0,1.5);
		bl1.show();
		Bottle bl2=new Bottle("Nike",3.33,1.5,"Black");
		bl2.show();
		Bottle bl4=new Bottle("Pigeod",2.8,1.6,"Blue",true);
		bl4.show();
		Bottle bl5=new Bottle("Milton",2.5,1.2,"ash",true,420);
		bl5.show();
	}

}
