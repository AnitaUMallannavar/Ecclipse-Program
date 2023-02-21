package com.java.instance21;

public class WaterFallRunner {

	public static void main(String[] args) {
		WaterFall wf=new WaterFall("Gogak Falls",234.3,"Gokak");
		System.out.println(wf);
		
		WaterFall wf1=new WaterFall("jog Falls",234.3,"shivamogga");
        System.out.println(wf1);
        
        WaterFall wf2=new WaterFall("jog Falls",234.3,"shivamogga");
        System.out.println(wf2);
        
        boolean bl=wf1.equals(wf2);
        System.out.println(bl);
        
        boolean bl1=wf.equals(wf2);
        System.out.println(bl1);
        
	}

}
