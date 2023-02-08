package com.java.association;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer en = new Engineer();
		String[] skil = { "java", "C++", "Python" };
		en.setSkills(skil);
		Degree dr = new Degree();
		dr.setName("B.Sc");
		dr.setDuration(4);
		dr.setPursuing(true);
		dr.setPersentage(88.82);
		dr.setBranch("Cs");
		Degree dr1 = new Degree();
		dr1.setName("B.Sc");
		dr1.setPursuing(true);
		dr1.setPersentage(88.82);
		dr1.setBranch("Cs");
		dr1.setDuration(3);
		Degree dr2 = new Degree();
		dr2.setName("B.Sc");
		dr2.setDuration(4);
		dr2.setPersentage(88.82);
		dr2.setBranch("Cs");
		dr2.setPursuing(true);
		Degree dr3 = new Degree();
		dr3.setName("B.Sc");
		dr3.setDuration(4);
		dr3.setPursuing(true);
		dr3.setBranch("Cs");
		dr3.setPersentage(87.82);
		Degree dr4 = new Degree();
		dr4.setName("B.Sc");
		dr4.setDuration(4);
		dr4.setPursuing(true);
		dr4.setPersentage(88.82);
		dr4.setBranch("Cs");
		Degree[] ref = { dr, dr1, dr2, dr3, dr4 };
		en.setDegrees(ref);
		en.display();

	}

}
