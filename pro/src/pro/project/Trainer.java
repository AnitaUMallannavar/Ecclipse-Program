package pro.project;

public class Trainer {
	public String name;
	public int age;
	public boolean present;

	public void init(String name, int age, boolean present) {
		this.name = name;
		this.age = age;
		this.present = present;
	}

	public void show() {
		System.out.println("Trainer name is:" + name);
		System.out.println("Trainer age is: " + age);
		System.out.println("Trainer is present:" + present);

	}
}
