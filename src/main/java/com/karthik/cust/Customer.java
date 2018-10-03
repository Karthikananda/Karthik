package com.karthik.cust;

import com.karthik.bank.BankAccount;
import com.karthik.bank.CurrentAccountV2;
import com.karthik.bank.Insurance;
import com.karthik.bank.SavingAccount;
import com.karthik.bank.SavingAccountversion2;

public class Customer {
	public static void main(String[] args) {
		/*BankAccount acc1=new BankAccount();
		acc1.withdraw(5000);
		acc1.deposit(6000);
		BankAccount acc2=new BankAccount();
		
		BankAccount acc3=acc1;
	
		System.out.println("Bank Account 1"+acc1);
		System.out.println("Bank Account 2"+acc2);
		System.out.println("Bank Account 3"+acc3);*/
		
		//BankAccount acc=null;
		
		//acc=new SavingAccount();
		//acc.withdraw(5000);
		Insurance insurance=null;
		insurance=new SavingAccountversion2();
		System.out.println(insurance.insuranceName("LIC"));
		System.out.println(insurance.insuranceAmount(5000));
		System.out.println(insurance.isLifeTime());
		
		Insurance insurance1=null;
		insurance1=new CurrentAccountV2();
		System.out.println(insurance1.insuranceName("Jeevan Bhima"));
		System.out.println(insurance1.insuranceAmount(7000));
		System.out.println(insurance1.isLifeTime());
		
		
		
	}
}
