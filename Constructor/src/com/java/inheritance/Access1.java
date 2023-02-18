package com.java.inheritance;

import com.java.accessiblility.Access;

public class Access1 extends Access {
	public int price = 28;

	@Override
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
