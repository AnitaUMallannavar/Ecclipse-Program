package com.java.chain;

public class GogalRunner {

	public static void main(String[] args) {
		Gogal gl=new Gogal("RayBon",1100,"transperent",true,true,"abd",true,"2year",98789674,'s');
		gl.show();
		System.out.println("---------");
		Gogal g2=new Gogal(500,987947377,'s');
		g2.show();
		System.out.println("---------");
		Gogal g3=new Gogal("black","xxx","1year","RayBon");
		g3.show();
		System.out.println("---------");
		Gogal g5=new Gogal(true,true,true,"RayBon","Transperent","RRR","1year");
		g5.show();
		
	}

}
