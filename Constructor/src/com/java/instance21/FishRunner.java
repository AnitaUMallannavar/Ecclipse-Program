package com.java.instance21;

public class FishRunner {

	public static void main(String[] args) {
		Fish fs=new Fish("Star",46,5,"black",true,true);
		System.out.println(fs);
		
		Fish fs1=new Fish("Shark",47,3,"blue",true,true);
		System.out.println(fs1);
		
		
		
		boolean bl=fs1.equals(fs);
		System.out.println(bl);
		
		boolean bl1=fs1.equals(fs1);
		System.out.println(bl1);
		
	}

}
