package com.java.association;

public class Runner1 {

	public static void main(String[] args) {
		Wallet wt = new Wallet("Cello", 420, "Chocolate");
		wt.show();
		Cards cd = new Cards("Debit", true);
		wt.init(cd);
		cd.show();

	}

}
