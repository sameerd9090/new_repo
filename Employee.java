package com.practice;

public class Employee {
	
	private int empID;
	private String empName;
	private String empComp;
	private int empSalary;
	
	
	
	public Employee(int empID, String empName, String empComp, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empComp = empComp;
		this.empSalary = empSalary;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpComp() {
		return empComp;
	}
	public void setEmpComp(String empComp) {
		this.empComp = empComp;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empComp=" + empComp + "]";
	}
	
	

}
