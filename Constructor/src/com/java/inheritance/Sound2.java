package com.java.inheritance;

import com.java.accessiblility.Sound;

public class Sound2 extends Sound {
    public Sound2() {
    	System.out.println("no args const of Sount2");
    }
	@Override
	//public void setA() {
		//System.out.println("++++++++");
	//}v  can not override inner class
	public boolean setVibration() {
		System.out.println("vibration setting");
		return true;
	}
	//@Override
	//public void setVibration() {
	//	System.out.println("vibration setting");
	//}(v can not override same 2 methods)
}
