package pro.project;

public class Camera {
	public String brand;
	public double price;
	public boolean good;

	public void init(String brand, double price, boolean good) {
		this.brand = brand;
		this.price = price;
		this.good = good;
	}

	public void show() {
		System.out.println("brand name is:" + brand);
		System.out.println("price is:" + price);
		System.out.println("it is good:" + good);
	}
}
