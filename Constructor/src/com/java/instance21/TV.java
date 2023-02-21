package com.java.instance21;

public class TV {
	private String brand;
	private int price;
	private double size;

	public TV(String brand, int price, double size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
		System.out.println(" args const of TV");
	}

	@Override
	public String toString() {

		return "[Brand : " + this.brand + "][ Price : " + this.price + "][Size : " + this.size;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("running equals in TV" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof TV) {
				System.out.println("arg is TV");
				TV casted = (TV) arg;
				TV left = this;
				TV right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is not equals");
				}
			} else {
				System.err.println("arg is  not TV");
			}
		} else {
			System.err.println(" arg is null");
		}
		return super.equals(arg);
	}

}
