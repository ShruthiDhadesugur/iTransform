package com.inheritanceexample;

public class Trainee extends Employee {

	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
		this.basicSalary=salary;
	}
    
}
