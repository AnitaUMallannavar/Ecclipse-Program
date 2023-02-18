package com.java.object;

public class TestCricket extends Cricket {
	public TestCricket() {
		System.out.println("no args const of TestCricket");
	}

	public String getCaptainName() {
		return "Virat";
	}

	@Override
	public String getCountry() {
		return "India";
	}

	public String getCoachName() {
		return "Rahul Dravid";
	}

}
