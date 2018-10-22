package com.capgemini.deposit.BankAccount;

public class BankAccount {
	 private String Name;
	   private String accNo;
	   private double accBal;
	   static int autoaccNo=0;
	   {
		   autoaccNo++;
	   }
	   
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getAccBal() {
		return accBal;
	}

	public BankAccount(String name, String accNo, double accBal) {
		super();
		Name = name;
		this.accNo = accNo;
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAccount [Name=" + Name + ", accNo=" + accNo + ", accBal=" + accBal + "]";
	}
	   

	   

}
