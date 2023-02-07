package com.java.association;

public class SunGlass {
	public String pixel;
	public boolean visible;
	public Brand brand;

	public SunGlass(String pixel, boolean visible) {
		this.pixel = pixel;
		this.visible = visible;
		System.out.println("constructor with String,boolean arguments");
	}

	public void init(Brand brand) {
		this.brand = brand;
		System.out.println("Initialisation");
	}

	public void show() {
		System.out.println("Writing about SunGlass..");
		System.out.println("pixel is:" + pixel);
		System.out.println("visible:" + visible);
		if (brand != null) {
			this.brand.show();
		} else {
			System.err.println("brand is not pointing to any memory");
		}
	}
}
