package com.DataManagement.employee;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name="employees")
public class Employees {
	
	@Id
	private Integer id;
	private String last_name;
	private String first_name;
	private String email;
	private String department;
	private BigDecimal salary;
	
	public Employees(Integer id, String last_name, String first_name, String email, String department, BigDecimal salary) {
		this.id = id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}
	
	public Employees() {}
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
}
