package com.java.accessrun;

import com.java.accessiblility.Access;
import com.java.inheritance.Access1;

public class AccessRunner {

	public static void main(String[] args) {
		Access as = new Access1() ;
		int it=as.setCost();//v can not create instance
		
	}
}
