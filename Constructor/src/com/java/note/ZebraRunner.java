package com.java.note;

public class ZebraRunner {

	public static void main(String[] args) {
		Zebra zebra=new Zebra();
		System.out.println("writing about zebra");
		System.out.println("Zebra name is:" +zebra.name);
	    System.out.println("zebra hight is:" +zebra.hight);
	    System.out.println("colour of zebra is:" +zebra.colour);
	    zebra.name="zebracon";
	    zebra.hight=8.6D;
	    zebra.colour="black & white";
	    System.out.println("Zebra name is:" +zebra.name);
	    System.out.println("zebra hight is:" +zebra.hight);
	    System.out.println("colour of zebra is:" +zebra.colour);

	}

}
