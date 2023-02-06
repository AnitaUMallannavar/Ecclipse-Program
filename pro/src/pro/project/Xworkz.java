package pro.project;

public class Xworkz {
	public String location;
	public double fees;
	public boolean good;
	public Trainer tr = new Trainer();

	public void init(String location, double fees, boolean good) {
		this.location = location;
		this.fees = fees;
		this.good = good;
	}

	public void display() {
		System.out.println("Xworkz location is:" + location);
		System.out.println("fees for each student:" + fees);
		System.out.println("it is good:" + good);
		this.tr.show();
	}
}
