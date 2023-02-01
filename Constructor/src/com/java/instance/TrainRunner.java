package com.java.instance;

public class TrainRunner {

	public static void main(String[] args) {
         Train tr=new Train();
         tr.show();
         Train tr2=new Train("golgubaj express");
         tr2.show();
         Train tr3=new Train(232323);
         tr3.show();
         Train tr4=new Train(4.30D);
         tr4.show();
         Train tr5=new Train(true);
         tr5.show();
         Train tr6=new Train("bijapur","bengalor");
         tr6.show();
         Train tr7=new Train("golgubaj express",310);
         tr7.show();
         Train tr8=new Train(true,true);
         tr8.show();
	}

}
