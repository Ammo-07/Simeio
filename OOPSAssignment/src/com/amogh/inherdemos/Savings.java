package com.amogh.inherdemos;

public class Savings extends Account {
	public Savings(double balance) {
		super(balance);
		}

		@Override
		public void withdraw(double amount) {
		if (amount <= balance) {
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
		System.out.println("Insufficient balance in Savings account.");
		}
		}

		@Override
		public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Updated balance: " + balance);
		}
		}

