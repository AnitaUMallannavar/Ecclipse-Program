package com.java.association;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hp = new Hospital();
		hp.setName("Dhanavantri");
		Doctor dr = new Doctor();
		dr.setNmae("vanaja");
		dr.setExpirience(4.4);
		Doctor[] ref = { dr };
		hp.setDoctor(ref);
		String[] spec = { "cardiyologist", "Darmatologist", "Dentist" };
		dr.setSpecillization(spec);
		hp.display();
	}

}
