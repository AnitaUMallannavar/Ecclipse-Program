package com.java.association;

public class Security {
	public String deptName;
	public int totalStaff;
	public String headStaff;
	public Company company;

	public Security(String deptName, String headStaff) {

		this.deptName = deptName;
		this.headStaff = headStaff;
	}

	public void setTotalStaff(int totalStaff) {
		this.totalStaff = totalStaff;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void show() {
		System.out.println("Wrinting about Security....");
		System.out.println("Department name is:" + this.deptName);
		System.out.println("Total Staff:" + this.totalStaff);
		System.out.println("Head Staff:" + this.headStaff);
		if (this.company != null) {
			this.company.show();
		} else {
			System.err.println("this.company is not pointing to any memory");
		}
	}
}
