package com.amogh.overloading;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// Get user input for employee details
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();

		System.out.print("Enter employee designation (Manager, Programmer, Director): ");
		String designation = scanner.nextLine();

		System.out.print("Enter basic allowance: ");
		double basicAllowance = scanner.nextDouble();

		double carAllowance = 0.0;
		double houseAllowance = 0.0;

		if (designation.equalsIgnoreCase("Manager")) {
		System.out.print("Enter car allowance: ");
		carAllowance = scanner.nextDouble();
		} else if (designation.equalsIgnoreCase("Director")) {
		System.out.print("Enter car allowance: ");
		carAllowance = scanner.nextDouble();
		System.out.print("Enter housing allowance: ");
		houseAllowance = scanner.nextDouble();
		}

		Employee employee = new Employee(name, designation);

		double bonus;

		if (designation.equalsIgnoreCase("Programmer")) {
		bonus = employee.calcBonus(basicAllowance);
		} else if (designation.equalsIgnoreCase("Manager")) {
		bonus = employee.calcBonus(basicAllowance, carAllowance);
		} else {
		bonus = employee.calcBonus(basicAllowance, carAllowance, houseAllowance);
		}

		System.out.println("Bonus: " + bonus);
		}
}
