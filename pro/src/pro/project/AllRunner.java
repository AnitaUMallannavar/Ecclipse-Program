package pro.project;

public class AllRunner {

	public static void main(String[] args) {
		System.out.println("About Phone & Camere");
		Phone phone = new Phone();
		phone.display();

		System.out.println("About Shirt & Button");
		Shirt shirt = new Shirt();
		shirt.display();

		System.out.println("About Temple & God");
		Temple temple = new Temple();
		temple.gd.show();

		System.out.println("About JawaBick & Engine");
		JawaBick jb = new JawaBick();
		jb.display();

		System.out.println("About Xworkz & Trainer");
		Xworkz x = new Xworkz();
		x.display();
	}

}
