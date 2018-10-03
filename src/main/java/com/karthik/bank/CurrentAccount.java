package com.karthik.bank;

public class CurrentAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		System.out.println("Saving");
	}
	public void isSalaryAccount() {
		System.out.println("SalaryAccount");
	}
}