package com.java.instance21;

public class WaterFall {
	private String name;
	private double height;
	private String location;

	public WaterFall(String name, double height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
		System.out.println("args const of WaterFall ");
	}

	@Override
	public String toString() {

		return "[Name : " + this.name + "Height : " + this.height + "Location : " + this.location;
	}

	@Override
	public boolean equals(Object wat) {
		System.out.println("running equals in WaterFall" + wat);
		if (wat != null) {
			System.out.println("wat is not null");
			if (wat instanceof WaterFall) {
				System.out.println("wat is Waterfall");
				WaterFall casted = (WaterFall) wat;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location)
						&& left.height == right.height) {
					System.out.println("left is equals to right");
					return true;
				}
				else
				{
					System.out.println("left is not equals to right");
				}
			} else {
				System.err.println("wat is not WaterFall");
			}
		} else {
			System.err.println("wat is null");
		}
		return super.equals(wat);
	}
}
