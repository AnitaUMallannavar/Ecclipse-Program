package com.java.instance21;

public class FootWare {
	private String brand;
	private double size;
	private String type;

	public FootWare(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
		System.out.println(" args const of FootWare");
	}

	@Override
	public String toString() {
		return "Brand : "      + this.brand + "Size : "        + this.size +   "Type : "        + this.type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in FootWare" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof FootWare) {
				System.out.println("obj is FootWare");
				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;
				//(if it is primitiv then == )( if it is non primitive then .equals) 
				if (left.brand.equals(right.brand) && left.size == right.size && left.type.equals(right.type)) {
					System.out.println("left is equals to right");
					return true;
				} else {
					System.err.println("left is not equals to right");
				}
			} else {
				System.out.println("obj is not FootWare");
			}
		} else {
			System.err.println(" obj is null");
		}
		return super.equals(obj);
	}
}
