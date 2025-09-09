//pojo class
package com.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//annotations
@Entity
@Table(name="employee_info")
public class Employee {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_id")
	private int eid;
	@Column(name="Employee_name")
	private String ename;
	private long mobileno;
	private int salary;
	
	//constructor
	public Employee(int eid, String ename, long mobileno, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobileno = mobileno;
		this.salary = salary;
	}
	
	//default constructor
	public Employee() {
		super();
	}
	
	//methods
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mobileno=" + mobileno + ", salary=" + salary + "]";
	}
	
	

}
