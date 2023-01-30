package com.java.note;

public class FanRunner {
	public static void main(String args[]) {
		Fan fan=new Fan();
		System.out.println(" fan name is:" +fan.name);
		System.out.println("cast of fan is:" +fan.cast);
		System.out.println("work of fan is:" +fan.work);
		fan.name="usha";
		fan.cast=8000;
		fan.work="it produce air..";
		System.out.println(" fan name is:" +fan.name);
		System.out.println("ast of fan is:" +fan.cast);
		System.out.println("work of fan is:" +fan.work);
				
	}

}
