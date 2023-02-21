package com.java.instance21;

public class Alcohol {
	private String name;
	private double percentage;
	private int price;
	private String type;

	public Alcohol(String name, double percentage, int price, String type) {
		this.name = name;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
		System.out.println("args const of Alcohol");
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "Percentage : " + this.percentage + "Price : " + this.price + "Type : "
				+ this.type;
	}

	@Override
	public boolean equals(Object hol) {
		System.out.println("running equals in Alcohol" + hol);
		if (hol != null) {
			System.out.println("hol is not null");
			if (hol instanceof Alcohol) {
				System.out.println("hol is Alcohol");
				Alcohol casted = (Alcohol) hol;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.name.equals(right.name) && left.type.equals(right.type) && left.percentage == right.percentage
						&& left.price == right.price) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is not equals to right");
				}
			} else {
				System.err.println("hol is not Alcohol");
			}
		} else {
			System.err.println("hol is null");
		}
		return super.equals(hol);
	}
}
