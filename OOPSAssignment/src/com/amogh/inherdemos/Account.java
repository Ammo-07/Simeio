package com.amogh.inherdemos;

public class Account {
	double balance;

	public Account(double balance) {
	this.balance = balance;
	}

	public void withdraw(double amount) {
	if (amount <= balance) {
	balance -= amount;
	System.out.println("Withdrawal successful. Remaining balance: " + balance);
	} else {
	System.out.println("Insufficient balance.");
	}
	}

	public void deposit(double amount) {
	balance += amount;
	System.out.println("Deposit successful. Updated balance: " + balance);
	}

	public double getBalance() {
	return balance;
	}
	}

