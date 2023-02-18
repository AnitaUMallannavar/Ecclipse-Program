package com.java.accessrun;

import com.java.accessiblility.Temple;
import com.java.inheritance.Temple2;

public class Temple2Runner {

	public static void main(String[] args) {
		Temple tmp = new Temple2();
		String st = tmp.setName();
		System.out.println("name is:" + st);

	}

}
