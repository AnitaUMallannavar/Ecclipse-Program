package com.java.accessrun;

import com.java.accessiblility.Sound;
import com.java.inheritance.Sound2;

public class SoundRunner {

	protected static void main(String[] args) {
		Sound so=new Sound2();
		boolean bl=so.setVibration();
		System.out.println(bl);
	}

}
