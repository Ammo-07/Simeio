package com.amogh.inherdemos;

public class Current extends Account {
	public Current(double balance) {
		super(balance);
		}

		@Override
		public void withdraw(double amount) {
		if (amount <= balance) {
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
		System.out.println("Insufficient balance in Current account.");
		}
		}

		@Override
		public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful . Updated balance: " + balance);
		}
		}


