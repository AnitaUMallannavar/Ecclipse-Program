package pro.project;

public class Shirt {
	public String size;
	public String colour;
	public boolean good;
	public Button bn = new Button();

	public void init(String size, String colour, boolean good) {
		this.size = size;
		this.colour = colour;
		this.good = good;
	}

	public void display() {
		System.out.println("Shirt size is:" + size);
		System.out.println("Shirt colour is:" + colour);
		System.out.println("Shirt is good:" + good);
		this.bn.show();
	}
}
