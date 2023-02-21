package com.java.instance21;

public class Cake {
	private String flavour;
	private int weight;
	private String shape;
	private int price;

	public Cake(String flavour, int weight, String shape, int price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
		System.out.println("args const of Cake");
	}

	@Override
	public String toString() {

		return "[Flavour : " + this.flavour + "][Weight : " + this.weight + "][Shape : " + this.shape + "][Price : "
				+ this.price;
	}

	@Override
	public boolean equals(Object hani) {
		System.out.println("running equals of Cake" + hani);
		if (hani != null) {
			System.out.println("hani is not null");
			if (hani instanceof Cake) {
				System.out.println("hani is cake");
				Cake casted = (Cake) hani;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.shape.equals(right.shape) && left.weight == right.weight
						&& left.price == right.price) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is not equals to right");
				}
			} else {
				System.err.println("hani is not Cake");
			}
		} else {
			System.err.println("hani is null");
		}
		return super.equals(hani);
	}
}
