package com.java.instance21;

public class Fish {
	private String name;
	private int cost;
	private int weight;
	private String colour;
	private boolean alive;
	private boolean good;

	public Fish(String name, int cost, int weight, String colour, boolean alive, boolean good) {
		this.name = name;
		this.colour = colour;
		this.cost = cost;
		this.good = good;
		this.weight = weight;
		this.alive = alive;
	}

	@Override
	public String toString() {

		return "[Name : " + this.name + "[Cost : " + this.colour + "[Weight : " + this.weight + "[Colour : "
				+ this.colour + "[Alive : " + this.alive + "[Good : " + this.good;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in Fish" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.name.equals(right.name) && left.colour.equals(right.colour) && left.alive == right.alive
						&& left.cost == right.cost && left.good == right.good && left.weight == right.weight) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.out.println("left is equals to right");
				}
			} else {
				System.err.println("obj is not Fish");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
}
