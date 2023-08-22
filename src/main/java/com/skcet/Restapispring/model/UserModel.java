package com.skcet.Restapispring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class UserModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;	
private String employeeName;
private int employeeAge;
private long salary;
public UserModel(int id, String employeeName, int employeeAge, long salary) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	this.employeeAge = employeeAge;
	this.salary = salary;
}
public UserModel() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
}


