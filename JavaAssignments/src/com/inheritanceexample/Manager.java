package com.inheritanceexample;

public class Manager extends Employee{

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
		this.basicSalary=salary;
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance;
		   transportAllowance=(.15)*basicSalary;
		   System.out.println("Transport allowance is "+transportAllowance);
	}
  
}
