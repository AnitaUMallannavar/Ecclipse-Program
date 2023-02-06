package com.java.Wrapper;

public class BookRuuner {

	public static void main(String[] args) {
		Book bk=new Book();
		bk.cost=45;
		bk.page=55;
		bk.noOfLine=12;
		bk.code=(float)66.3;
		bk.number=6666666;
		bk.pass='v';
		bk.good=true;
		bk.size=4.5;
		int cost = 46;
		System.out.println("book cost is:"+cost); 
		
		Byte bt=bk.page;
		System.out.println("autoboxing:"+bt);
		Short st=bk.noOfLine;
		System.out.println("boxing:"+st);
		Integer it=bk.cost;
		System.out.println("boxing:"+it);
		Long lg=bk.number;
		System.out.println("boxing:"+lg);
		Float ft=bk.code;
		System.out.println("boxing:"+ft);
        Double dl=bk.size;
        System.out.println("boxing:"+dl);
        Boolean bl=bk.good;
        System.out.println("boxing:"+bl);
        Character cr=bk.pass;
        System.out.println("boxing:"+cr);
        
        System.out.println("=============");
        
        byte rb=new Byte(bk.page);
        System.out.println("Nuboxing"+rb);
        short ts=new Short(bk.noOfLine);
        System.out.println("Nuboxing"+ts);
        int t=new Integer(bk.cost);
        System.out.println("Nuboxing"+t);
        long l=new Long(bk.number);
        System.out.println("Nuboxing"+l);
        float f=new Float(bk.code);
        System.out.println("Nuboxing"+f);
        double d=new Double(bk.size);
        System.out.println("Nuboxing"+d);
        boolean b=new Boolean(bk.good);
        System.out.println("Nuboxing"+b);
        char c=new Character(bk.pass);
        System.out.println("Nuboxing"+c);
        
	}

}
