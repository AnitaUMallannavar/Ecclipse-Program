package pro.project;

public class Temple {
	public double tHight;
	public String name;
	public boolean good;
	public God gd = new God();

	public void init(double tHight, String name, boolean good) {
		this.tHight = tHight;
		this.name = name;
		this.good = good;
	}

	public void display() {
		System.out.println("Temple Hight is:" + tHight);
		System.out.println("Temple name is:" + name);
		System.out.println("Temple is good:" + good);
		this.gd.show();
	}
}
