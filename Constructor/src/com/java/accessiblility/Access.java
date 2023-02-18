package com.java.accessiblility;

public class Access {
	
	public int cost;
	public boolean good;
	public double weight;
	
     public Access() {
    	 System.out.println("no args const of Access");
     }
     protected Access(int cost) {
    	 System.out.println("with args const of access");
    	 this.cost=cost;
     }
     protected Access(boolean good) {
    	 this.good=good;
     }
     protected Access(double weight) {
    	 this.weight=weight;
     }
     public int setCost() {
    	 return 23;
     }
     protected boolean setGood() {
    	 return true;
     }
     protected double setWeight() {
    	 return 44;
     }
}
