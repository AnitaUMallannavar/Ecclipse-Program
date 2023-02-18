package com.java.object;

public class Cricket extends Sport {
	public Cricket() {
		System.out.println("no args const of Cricket");
	}

	@Override
	public int total() {
		return 11;
	}

	public String getCountry() {
		return "India";
	}

	public String getCoachName() {
		return "Rahul Dravid";
	}
}
