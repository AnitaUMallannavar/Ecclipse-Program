package com.java.chain;

public class PlaceRunner {

	public static void main(String[] args) {
		Place pl=new Place("Vijayapur",450000,"Vijayapur","Karnataka","India");
		pl.show();
		System.out.println("---------");
		Place p2=new Place("Vijayapur",4500000);
		p2.show();
		System.out.println("---------");
		Place p3=new Place("Bagalkot",460000,"Karnataka");
		p3.show();
		System.out.println("---------");
		Place p4=new Place("Belagavi",560000,"Belagavi","Karnataka");
		p4.show();
		System.out.println("---------");
	    Place p5=new Place("Bangalor",9000000,"Bangalor","Karnataka","India");
	    p5.show();
	    System.out.println("---------");

}
}