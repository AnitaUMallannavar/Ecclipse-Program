package com.java.instance21;

public class Park {
	private String name;
	private int tikketPrice;
	private double totalArea;
	private int noOfGates;
	private boolean good;
	private boolean popular;

	public Park(String name, int tikketPrice, double totalArea, int noOfGates, boolean good, boolean popular) {
		this.name = name;
		this.tikketPrice = tikketPrice;
		this.totalArea = totalArea;
		this.noOfGates = noOfGates;
		this.popular = popular;
		this.good = good;
	}

	@Override
	public String toString() {

		return "[Name : " + this.name + "[TikketPrice : " + this.tikketPrice + "[TotalArea : " + this.popular
				+ "[noOfGates : "+this.noOfGates +"[Popular : " +this.popular + "[Good : " + this.good;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Park" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Park) {
				System.out.println("obj is Park");
				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;
				if (left.name.equals(right.name) && left.good == right.good && left.popular == right.popular
						&& left.noOfGates == right.noOfGates && left.tikketPrice == right.tikketPrice
						&& left.totalArea == right.totalArea) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is not equals to right");
				}
			} else {
				System.err.println("obj is not Park");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
}
