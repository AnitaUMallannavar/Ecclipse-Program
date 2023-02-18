package com.java.object;

public class ODICricket extends Cricket {
	public ODICricket() {
		System.out.println("no args const of ODICricket");
	}

	public String getGroundName() {
		return "polo";
	}

	@Override
	public String getCountry() {
		return "India";
	}

	public String getCoachName() {
		return "Rahul Dravid";
	}
}
