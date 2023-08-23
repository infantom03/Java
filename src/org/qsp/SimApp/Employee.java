package org.qsp.SimApp;

public class Employee {
	private String name;
	private int eid;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > this.salary) {
			this.salary = salary;
		}
	}

	Employee(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return "name:" + name + "eid :" + eid + "salary:" + salary;
	}
}
