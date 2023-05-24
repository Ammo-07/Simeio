package com.amogh.inherdemos;
import java.util.*;
public class Main  {

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();

		System.out.println("Select account type (1 for Savings, 2 for Current): ");
		int accountType = scanner.nextInt();

		Account account;

		if (accountType == 1) {
			account = new Savings(initialBalance);
		} else if (accountType == 2) {
			account = new Current(initialBalance);
		} else {
			System.out.println("Invalid account type selected.");
			return;
		}

		while (true) {
			System.out.println("\nATM Menu:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.print("Enter the amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Current balance: " + account.getBalance());
				break;
			case 4:
				System.out.println("Thank you for using the ATM.");
				return;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}

	}

}
