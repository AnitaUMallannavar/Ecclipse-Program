package pro.project;

public class God {
	public String gName;
	public String location;
	public boolean silent;

	public void init(String gName, String location, boolean silent) {
		this.gName = gName;
		this.location = location;
		this.silent = silent;
	}

	public void show() {
		System.out.println("God name is:" + gName);
		System.out.println("Temple location is:" + location);
		System.out.println("Temple is silent:" + silent);
	}

}
