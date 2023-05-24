package com.amogh.overloading;

public class Employee {

	private String name;
	private String designation;

	public Employee(String name, String designation) {
	this.name = name;
	this.designation = designation;
	}

	public double calcBonus(double basicAllowance) {
	return basicAllowance * 0.1; // Assuming bonus is calculated as 10% of basic allowance
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
	return (basicAllowance + carAllowance) * 0.1;
	}

	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
	return (basicAllowance + carAllowance + houseAllowance) * 0.1;
	}
}