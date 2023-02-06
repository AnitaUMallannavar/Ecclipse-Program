package pro.project;

public class Phone {
	public String brand;
	public int price;
	public boolean works;
	public Camera cr = new Camera();

	public void init(String brand, int price, boolean works) {
		this.brand = brand;
		this.price = price;
		this.works = works;
	}

	public void display() {
		System.out.println("brand name is:" + brand);
		System.out.println("Phone price is:" + price);
		System.out.println("Phone is working:" + works);
		this.cr.show();
	}
}
