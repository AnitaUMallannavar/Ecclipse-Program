package pro.project;

public class Engine {
	public String name;
	public String size;
	public boolean good;

	public void init(String name, String size, boolean good) {
		this.name = name;
		this.size = size;
		this.good = good;
	}

	public void show() {
		System.out.println("Engine name is:" + name);
		System.out.println("size is:" + size);
		System.out.println("it is good:" + good);
	}
}
