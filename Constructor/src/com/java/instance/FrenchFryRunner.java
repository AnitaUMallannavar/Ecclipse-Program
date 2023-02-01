package com.java.instance;

public class FrenchFryRunner {
         public static void main(String[] args) {
        	 FrenchFry ref=new FrenchFry();
        	 ref.show();
        	 FrenchFry ref1=new FrenchFry(true);
        	 ref1.show();
        	 FrenchFry ref2=new FrenchFry("good");
        	 ref2.show();
        	 FrenchFry ref3=new FrenchFry("good","good");
        	 ref3.show();
        	 FrenchFry ref4=new FrenchFry("22/2/2022",true);
        	 ref4.show();
        	 FrenchFry ref5=new FrenchFry(true,"super");
        	 ref5.show();
        	 FrenchFry ref6=new FrenchFry(45);
        	 ref6.show();
        	 FrenchFry ref7=new FrenchFry("best",50);
        	 ref7.show();
        	 FrenchFry ref8=new FrenchFry("better","better","13/2/2022");
        	 ref8.show();
        	 FrenchFry ref9=new FrenchFry("true",true,true);
        	 ref9.show();
        	 FrenchFry ref10=new FrenchFry(true,20);
        	 ref10.show();
         }
}
