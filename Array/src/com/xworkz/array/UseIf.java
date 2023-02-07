package com.xworkz.array;

public class UseIf {

	public static void main(String[] args) {
     int num=5;
     
     for(int i=0;i<=num;i++) {
    	 for(int j=0;j<=num;j++) {
    		 if(i==0&&j==0||i==1&&j==0||i==1&&j==1||i==2&&j==0||i==2&&j==1||i==2&&j==2) {
    			 System.out.print(j+" " );
    		 }else {
    		 System.out.println();
    		 }
    		 System.out.print("");
    	 }
    	 
     }
	}

}
