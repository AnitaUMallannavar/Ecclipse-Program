package pro.project;

public class Button {
	public String shep;
	public int price;
	public String colour;

	public void init(String shep, int price, String colour) {
		this.shep = shep;
		this.price = price;
		this.colour = colour;
	}

	public void show() {
		System.out.println("button shep is:" + shep);
		System.out.println("button price is:" + price);
		System.out.println("button colour is:" + colour);
	}
}
