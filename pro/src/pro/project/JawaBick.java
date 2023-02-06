package pro.project;

public class JawaBick {
	public String brand;
	public double cost;
	public boolean singleSheet;
	public Engine eg = new Engine();

	public void init(String brand, double cost, boolean singleSheet) {
		this.brand = brand;
		this.cost = cost;
		this.singleSheet = singleSheet;
	}

	public void display() {
		System.out.println("brand is:" + brand);
		System.out.println("cost is:" + cost);
		System.out.println("it has single Sheet:" + singleSheet);
		this.eg.show();
	}
}
